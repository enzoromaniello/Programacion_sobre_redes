package EjerciciosGuia;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Date;
import java.util.List;
import java.io.BufferedReader;
import java.util.ArrayList;


public class funciones {

	public static String obtenerSignoZodiaco(Date fechaNacimiento) {
		int mes = fechaNacimiento.getMonth() + 1;
        int dia = fechaNacimiento.getDate();
        
        switch (mes) {
            case 1: //Enero
                if (dia >= 20) {
                    return "Acuario";
                } else {
                    return "Capricornio";
                }
            case 2: //Febrero
                if (dia >= 19) {
                    return "Piscis";
                } else {
                    return "Acuario";
                }
            case 3: //Marzo
                if  (dia >= 21) {
                    return "Aries";
                } else {
                    return "Piscis";
                }
            case 4: //Abril
                if (dia >= 20) {
                    return "Tauro";
                } else {
                    return "Aries";
                }
            case 5: //Mayo
                if (dia >= 21) {
                    return "Géminis";
                } else {
                    return "Tauro";
                }
            case 6: //Junio
                if (dia >= 21) {
                    return "Cáncer";
                } else {
                    return "Géminis";
                }
            case 7: //Julio
                if (dia >= 23) {
                    return "Leo";
                } else {
                    return "Cáncer";
                }
            case 8: //Agosto
                if (dia >= 23) {
                    return "Virgo";
                } else {
                    return "Leo";
                }
            case 9: //Septiembre
                if (dia >= 23) {
                    return "Libra";
                } else {
                    return "Virgo";
                }
            case 10: //Octubre
                if (dia >= 23) {
                    return "Escorpio";
                } else {
                    return "Libra";
                }
            case 11: //Noviembre
                if (dia >= 22) {
                    return "Sagitario";
                } else {
                    return "Escorpio";
                }
            case 12: //Diciembre
                if (dia >= 22) {
                    return "Capricornio";
                } else {
                    return "Sagitario";
                }
            default:
                return "Fecha inválida";
        }
    }


	public static String leer() {
		int Byte = 0;
		String cadena = "";
		try {
			while( ( Byte = System.in.read() ) != '\n') {
				if( Byte != '\r') {
					cadena += (char)Byte;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return cadena;
	}

	public static String[] ingresarDatosEnLista() {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintStream ps = System.out;
	
	        ps.println("¿Cuántos datos desea ingresar?");
	        int cantidadDatos = 0;
	
	        try {
	            cantidadDatos = Integer.parseInt(br.readLine());
	            ps.println("");
	        } catch (IOException | NumberFormatException e) {
	            e.printStackTrace();
	        }
	
	        String[] datos = new String[cantidadDatos];
	
	        try {
	            for( int i = 0 ; i < cantidadDatos ; i++ ) {
	                ps.println("Ingrese el dato: ");
	                datos[i] = br.readLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	
	        ps.println("");
	        ps.println("Se creó el archivo.");
	
	        return datos;
	    }
	public static List<Integer> filtrarNumeros(String[] datos) {
        List<Integer> numerosLista = new ArrayList<>();

        for (String dato : datos) {
            try {
                int numero = Integer.parseInt(dato);
                numerosLista.add(numero);
            } catch (NumberFormatException e) {
                // No es un número entero, ignorar y continuar
            }
        }

        return numerosLista;

    }

}