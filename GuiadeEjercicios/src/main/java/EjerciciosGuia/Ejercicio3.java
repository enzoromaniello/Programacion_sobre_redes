package EjerciciosGuia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;


public class Ejercicio3 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream ps = new PrintStream(System.out);

	
	public static void Ej3a() {
		String[] datos = funciones.ingresarDatosEnLista();
		
		File archivo = new File("hola.txt");
		FileWriter fw;
		
		try {
			fw = new FileWriter( archivo , false );
			PrintWriter pw = new PrintWriter(fw);
			if( datos.length > 0 ) {
				String ultimoDato = datos[ datos.length -1 ];
				pw.println(ultimoDato);
			} else {
				pw.println("No se han ingresado datos.");
			}
			
			fw.flush();
			pw.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void Ej3b() {
		String[] datos = funciones.ingresarDatosEnLista();
		
		File archivo = new File("datos.txt");
		FileWriter fw;
		
        List<Integer> numerosLista = funciones.filtrarNumeros(datos);

        try {
            fw = new FileWriter( archivo , false );
			PrintWriter pw = new PrintWriter(fw);
			
            for (int numero : numerosLista) {
                pw.println(numero);
            }

            fw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	
	public static void Ej3c() {
		List<Integer> numerosPares = new ArrayList<>();
		
		for( int i = 0 ; i <= 1000 ; i += 2) {
			numerosPares.add(i);
		}
		
		File archivo = new File("../Archivos/numeros.txt");
		
		FileWriter fw;
		PrintWriter pw;
		try {
			fw = new FileWriter( archivo , false );
			pw = new PrintWriter(fw);
			
			for( int num : numerosPares ) {
				pw.println(num);
			}
			
			fw.flush();
			pw.close();
			fw.close();
			
			ps.println("Archivo creado.");
		} catch (IOException e) {
			e.printStackTrace();
			ps.println("Error al crear el archivo: " + e.getMessage());
		}
	}
	
	
	public static void Ej3d() {
		String cadena = funciones.leerArchivo("../Archivos/numeros.txt");
		
		ps.println(cadena);
	}
	
	
	public static void Ej3e() {
		String cadena = funciones.leerArchivo("../Archivos/numeros.txt");
		
		cadena = cadena.replaceAll("(?m)^.*[13579].*$", "");
		
		FileWriter fw;
		PrintWriter pw;
		
		try {
			fw = new FileWriter("../Archivos/numeros.txt");
			pw = new PrintWriter(fw);
			
			pw.println(cadena);
			
			fw.flush();
			pw.close();
			fw.close();
			
			ps.println("Archivo actualizado.");
		} catch (IOException e) {
			e.printStackTrace();
			ps.println("Error al actualizar el archivo: " + e.getMessage());
		}
	}
	
	
	public static void Ej3f() {
	    String cadena = funciones.leerArchivo("../Archivos/numeros.txt");
	    
	    List<Integer> numerosPrimos = new ArrayList<>();
	    
	    File archivo = new File("../ArchivosExtras/primos.dat");
	    
	    FileWriter fw;
	    PrintWriter pw;
	    
	    try {
	        fw = new FileWriter(archivo);
	        pw = new PrintWriter(fw);
	        
	        String[] numeros = cadena.split("\n");
	        
	        for( String num : numeros ) {
	        	try {
	                int numero = Integer.parseInt(num);
	                if( funciones.esPrimo(numero) ) {
	                    numerosPrimos.add(numero);
	                }
	            } catch (NumberFormatException e) {
	                // Ignorar líneas que no se pueden convertir a enteros
	            }
	        }
	        
	        for (int primo : numerosPrimos) {
	            pw.println(primo);
	        }
	        
	        fw.flush();
	        pw.close();
	        fw.close();
	        br.close();
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void Ej3g() {
		
		List<String> palabras = new ArrayList<>();
		
		String rutaArchivo = "../Archivos/caracteres.dat";
		
	    
	    FileWriter fw;
	    PrintWriter pw;
	    
	   
    	try {
    		for( int i = 0 ; i < 10 ; i++ ) {
    			ps.println("Ingrese una palabra con ñ: ");
    			palabras.add(br.readLine());
    		}
    		
    		fw = new FileWriter(rutaArchivo);
	        pw = new PrintWriter(fw);
	        
	        for( String palabra : palabras ) {
	        	pw.println(palabra);
	        }
	        
	        pw.close();
	        
	        ps.println("");
	        ps.println("Fichero original:");
	        ps.println("");
	        FileReader fr = new FileReader(rutaArchivo);
	        BufferedReader br = new BufferedReader(fr);
    		
	        String linea;
            while( (linea = br.readLine()) != null ) {
                System.out.println(linea);
            }
	        
            br.close();
            
            
            
            List<String> lineasEditadas = new ArrayList<>();

            BufferedReader brEd = new BufferedReader(new FileReader(rutaArchivo));
            while ( (linea = brEd.readLine()) != null ) {
            	String palabraEditada = funciones.reemplazarEquivalenteFonetico(linea);
                lineasEditadas.add(palabraEditada);
            }
            
            brEd.close();

            
            
            fw = new FileWriter(rutaArchivo);
            pw = new PrintWriter(fw);
            
            for( String lineaEditada : lineasEditadas ) {
                pw.println(lineaEditada);
            }
            
            pw.close();

            
	        ps.println("");
            ps.println("Fichero arreglado:");
            ps.println("");
            BufferedReader brEd2 = new BufferedReader(new FileReader(rutaArchivo));
            while( (linea = brEd2.readLine()) != null ) {
                ps.println(linea);
            }
            
            brEd2.close();
            
            
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	}
}