package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import utiles.Conexion;

public class Servidor extends Conexion {

	DataInputStream disSer = null;

	public Servidor() {
		
	}

	@SuppressWarnings("deprecation")
	public void serverOn() {
		try {
			
        	ps.println("Ingrese el puerto para recibir(ej:5050): ");
        	int puerto = Integer. parseInt(br.readLine());
        	setConexion("servidor","localhost",puerto);
        
			ps.println("Esperando a cliente en el puerto "+puerto+"...");
			
			// congela programa (thread)
			sock = servSock.accept();
			ps.println(
					"IP: " + sock.getInetAddress().getHostAddress() + "\nNombre: " + sock.getInetAddress().getHostName()
							+ "\nPuerto: " + sock.getPort() + "\nPuerto Local: " + sock.getLocalPort() + "\n");

			dosSer = new DataOutputStream(sock.getOutputStream());
			disSer = new DataInputStream( sock.getInputStream());

			ps.println("Cliente conectado con correctamente");
			ps.println("Escribe" +ANSI_GREEN+" /exit "+ ANSI_RESET+"para finalizar la conversacion");
			
			
			// thread que escucha todo el tiempo los mensajes que lleguen
			Thread recibeSocket = new Thread(
					new Runnable() {
						public void run() {
							try {
									while (msgToSend != "/exit" || msg != "/exit") {
									msg = disSer.readUTF();
										if(msg.equals("/exit"))
										{
											ps.println(ANSI_GREEN + "-------- Cliente desconectado --------" + ANSI_RESET);
											break;
										}
										ps.println(ANSI_PURPLE + "\n>" + msg + ANSI_RED);						
										
									
									}
									
							} catch (IOException e) {
								// TODO Auto-generated catch block
								if(e.getMessage().equals("Socket closed")) {
									ps.println(ANSI_GREEN + "-------- Chat Cerrado --------" + ANSI_RESET);
								}else if(e.getMessage().equals("Connection reset")){
									ps.println(ANSI_GREEN + "-------- Cliente Desconectado --------" + ANSI_RESET);
								}else {
									e.printStackTrace();
								}
	
								
							}finally {
									try {
										
										if (sock != null) sock.close();
										if (disSer != null)disSer.close();
										if (dosSer != null)dosSer.close();
										if (servSock != null)servSock.close();
										
										
									} catch (IOException e) {
										e.printStackTrace();
									}
							}
						}
					},"EscuchaSocket"
			);
			
			recibeSocket.start();
					
			
			// thread que escucha todo el tiempo la consola y envia los mensajes al cliente
						Thread envioMsgSocket = new Thread(
								new Runnable() {
									public void run() {
										try {
											
												while (msgToSend != "/exit" || msg != "/exit") {
													ps.print(ANSI_RED);
													msgToSend = br.readLine();
													ps.println(ANSI_RESET);
													if(msgToSend.equals("/exit") || msg.equals("/exit"))
													{
														dosSer.writeUTF(msgToSend);
														dosSer.flush();
														break;
													}
													if(msgToSend != null  && msgToSend != "") {
														dosSer.writeUTF(msgToSend);
														dosSer.flush();
													}
													
												}
												
										} catch (IOException e) {
											// TODO Auto-generated catch block
											if(e.getMessage().equals("Socket closed")) {
												ps.println(ANSI_GREEN + "-------- Chat Cerrado --------" + ANSI_RESET);
											}else if(e.getMessage().equals("Connection reset")){
												ps.println(ANSI_GREEN + "-------- Cliente Desconectado --------" + ANSI_RESET);
											}else {
												e.printStackTrace();
											}
										}finally {
												try {
													if (sock != null) sock.close();
													if (disSer != null)disSer.close();
													if (dosSer != null)dosSer.close();
													if (servSock != null)servSock.close();
												} catch (IOException e) {
													e.printStackTrace();
												}
										}
									}
								},"EnvioMsgSocket"
						);
						
						envioMsgSocket.start();
						
			

		} catch (IOException e) {
			ps.println(ANSI_RESET);
			e.printStackTrace();
		} 

	}

}