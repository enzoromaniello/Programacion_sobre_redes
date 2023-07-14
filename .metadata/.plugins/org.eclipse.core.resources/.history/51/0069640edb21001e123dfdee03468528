package EjerciciosGuia;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.Random;

public class funciones {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream ps = System.out;
	
	// Lee una cadena de texto.
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

	
	
	// Ingresa datos dados por el usuario en una lista.
	public static String[] ingresarDatosEnLista() {

        ps.println("Â¿CuÃ¡ntos datos desea ingresar?");
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
        ps.println("Se creÃ³ el archivo.");

        return datos;
    }
	
	
	
	// Filtra solo los datos numericos de una lista.
	public static List<Integer> filtrarNumeros(String[] datos) {
        List<Integer> numerosLista = new ArrayList<>();
        
        for (String dato : datos) {
            try {
                int numero = Integer.parseInt(dato);
                numerosLista.add(numero);
            } catch (NumberFormatException e) {
                // No es un nÃºmero entero, ignorar y continuar
            }
        }
        
        return numerosLista;
        
	}
	
	
	
	// Lee cualquier archivo de texto plano que se la pase como parámetro.
	public static String leerArchivo(String nombreArchivo) {
	    String texto = "";

	    try {
	        FileReader fr = new FileReader(nombreArchivo);
	        BufferedReader br = new BufferedReader(fr);

	        String linea = "";

	        while ((linea = br.readLine()) != null) {
	            texto += "\n" + linea;
	        }

	        br.close();

	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return texto;
	}
	
    
	
	// Determina si un número es primo.
	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
	
	
	
	// Dependiendo de la palabra que contenga ñ, reemplaza la ñ por su equivalente fonético.
	public static String reemplazarEquivalenteFonetico(String palabra) {
        String palabraEditada = "";
        int i = 0;
        
        while( i < palabra.length() ) {
            char c = palabra.charAt(i);
            if( c == 'ñ' && i < palabra.length() - 1 ) {
                char siguiente = palabra.charAt(i + 1);
                switch(siguiente) {
                    case 'a':
                        palabraEditada += "nia";
                        break;
                    case 'e':
                        palabraEditada += "nie";
                        break;
                    case 'i':
                        palabraEditada += "nii";
                        break;
                    case 'o':
                        palabraEditada += "nio";
                        break;
                    case 'u':
                        palabraEditada += "niu";
                        break;
                    default:
                        palabraEditada += "nio";
                        break;
                }
                i++;
            } else {
                palabraEditada += c;
            }
            i++;
        }
        return palabraEditada;
    }
	
	
	
	//
	public static void mostrarResultado(List<Integer> numeros) {
		ps.println("NÃºmeros ingresados: " + leerValores(numeros));
		ps.println("Suma de los valores: " + sumarValores(numeros));
		ps.println("Promedio de los valores: " + sumarValores(numeros)/numeros.size());
	}
	
	
	
	//
	public static int leerValores(List<Integer> numeros) {
		int cantidadNum = 0;
		for( int i = 0 ; i < numeros.size() ; i++ ) {
			cantidadNum+=1;
		}
		return cantidadNum;
	}
	
	
	
	//
	public static int sumarValores(List<Integer> numeros) {
		int suma = 0;
		for(Integer num : numeros) {
			suma += num;
		}
		return suma;
	}
	
	
	
	//
	public static void imprimirElementos(List<String> lista) {
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String jugador = iterator.next();
            System.out.println(jugador);
        }
    }
	
	
	
	//
	 public static int[] generarNumerosRojos(int cantidad) {
        int[] numerosRojos = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int numeroRojo;
            do {
                numeroRojo = generarNumeroAleatorio(1, 33);
            } while (existeNumero(numerosRojos, numeroRojo));

            numerosRojos[i] = numeroRojo;
        }

        return numerosRojos;
	 }
	 
	 
	 
	 //
	 public static boolean existeNumero(int[] numeros, int numero) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                return true;
            }
        }
        return false;
	 }
	 
	 
	 
	 //
	 public static int generarNumeroAleatorio(int min, int max) {
	        Random random = new Random();
	        return random.nextInt(max - min + 1) + min;
	 }
}