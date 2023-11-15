package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import utiles.Conexion;

public class Cliente extends Conexion {

    DataInputStream disCli = null;

    public Cliente() {
    	 
    }

    public void clienteOn() {
        try {
        	ps.println("Ingrese la ip del servidor(ej: 127.0.0.1): ");
        	String address = br.readLine();
        	ps.println("Ingrese el puerto(ej:5050): ");
        	int puerto = Integer. parseInt(br.readLine());
        	setConexion("cliente",address,puerto);
        	
            ps.println("IP: " + sock.getInetAddress().getHostAddress() + "\nNombre: "
                    + sock.getInetAddress().getHostName() + "\nPort: " + sock.getPort() + "\nPort Local: "
                    + sock.getLocalPort() + "\n");

            dosCli = new DataOutputStream(sock.getOutputStream());
            disCli = new DataInputStream(sock.getInputStream());

            ps.println("Ya podes mandar mensajes!");
			ps.println("Podes escribir" +ANSI_RED+" /exit "+ ANSI_RESET+"para finalizar la conversacion");


            // Hilo para recibir mensajes del servidor
            Thread recibeSocket = new Thread(new Runnable() {
                public void run() {
                    try {
                        while (msgToSend != "/exit" || msg != "/exit") {
                            msg = disCli.readUTF();
                            if (msg.equals("/exit")) {
                                ps.println("\t-------- Desconectado del servidor --------");
                                break;
                            }
                            ps.println(ANSI_PURPLE + "\n>" + msg + ANSI_GREEN);

                        }
                    } catch (IOException e) {
                    	if(e.getMessage().equals("Socket closed")) {
							ps.println(ANSI_RED + "-------- Chat Cerrado --------" + ANSI_RESET);
						}else if(e.getMessage().equals("Connection reset")){
							ps.println(ANSI_RED + "-------- Servidor Desconectado --------" + ANSI_RESET);
						}else {
							e.printStackTrace();
						}
                    } finally {
                        try {
                            if (sock != null) sock.close();
							if (disCli != null)disCli.close();
							if (dosSer != null)dosSer.close();
							if (servSock != null)servSock.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, "RecibeSocket");

            recibeSocket.start();

            // Hilo para enviar mensajes desde la consola del cliente
            Thread envioMsgSocket = new Thread(new Runnable() {
                public void run() {
                    try {
                        while (true) {
                        	ps.print(ANSI_GREEN);
							msgToSend = br.readLine();
							ps.println(ANSI_RESET);
                            if (msgToSend.equals("/exit")) {
                                dosCli.writeUTF("/exit");
                                dosCli.flush();
                                break;
                            }
                            if (msgToSend != null && !msgToSend.isEmpty()) {
                                dosCli.writeUTF(msgToSend);
                                dosCli.flush();
                            }
                        }

                    } catch (IOException e) {
                    	if(e.getMessage().equals("Socket closed")) {
							ps.println(ANSI_RED + "-------- Chat Cerrado --------" + ANSI_RESET);
						}else {
							e.printStackTrace();
						}
                    } finally {
                        try {
                        	if (sock != null) sock.close();
 							if (disCli != null)disCli.close();
 							if (dosSer != null)dosSer.close();
 							if (servSock != null)servSock.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, "EnvioMsgSocket");

            envioMsgSocket.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}