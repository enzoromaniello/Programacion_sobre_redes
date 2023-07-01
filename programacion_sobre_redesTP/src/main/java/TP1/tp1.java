package TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.io.FileReader;

public class tp1 {
	static PrintStream ps = System.out;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	/*   
	 * 
	 *  PUNTO 1
	 * 
	 * 
	 * */
	
	public static void ingresarDatos() {
	    ps.println("¿Cuántos datos desea ingresar?");
	    int cantidadDatos = leerEntero();

	    String[] datos = leerDatosVector(cantidadDatos);
	    imprimirValoresVector(datos);

	    escribirDatosArchivo(datos);
	    
	    generarArchivoResultadosYError(datos);
	    
	    generarArchivoResultadosYErrorDos(datos);
	    
	    ps.println(leer());

	    ps.println("");
	    ps.println("Se creó el archivo.");
	}

	
	private static int leerEntero() {
	    int cantidadDatos = 0;
	    
	    try {
	        cantidadDatos = Integer.parseInt(br.readLine());
	        ps.println("");
	    } catch (IOException | NumberFormatException e) {
	        e.printStackTrace();
	    }
	    
	    return cantidadDatos;
	}

	
	private static String[] leerDatosVector(int cantidadDatos) {
	    String[] datos = new String[cantidadDatos];
	    
	    try {
	        for ( int i = 0 ; i < cantidadDatos ; i++ ) {
	            ps.println("Ingrese el dato para escribirlo en el vector (mínimo 5 datos): ");
	            datos[i] = br.readLine();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    return datos;
	}

	
	private static void imprimirValoresVector(String[] datos) {
	    ps.println("");
	    ps.println("Valores dentro del vector: ");
	    
	    for( int i = 0 ; i < datos.length ; i++ ) {
	        ps.println(datos[i]);
	    }
	    
	    ps.println("");
	}

	
	private static void escribirDatosArchivo(String[] datos) {
	    File archivo = new File("datos.txt");
	    
	    try {
			FileWriter fw = new FileWriter(archivo , false);
			PrintWriter pw = new PrintWriter(fw);
			
			for( int i = 0 ; i < datos.length ; i++ ) {
			    ps.println("Ingrese el dato para escribirlo en el archivo (mínimo 5 datos): ");
			    String dato = br.readLine();
			    pw.println(dato);
			}
			
			fw.flush();
			pw.close();
			fw.close();
        } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	}
	
	
	/*
	 * 
	 * 
	 *   PUNTO 2
	 * 
	 * 
	 * 
	 */
	
	public static void generarArchivoResultadosYError(String[] datos) {
	    File archivo = new File("resultados.txt");
	    File archivoError = new File("error.txt");
	    
	    try {
	        FileWriter fw = new FileWriter(archivo , false );
	        PrintWriter pw = new PrintWriter(fw);
	        
			FileWriter fwr = new FileWriter(archivoError , true);
			PrintWriter pwr = new PrintWriter(fwr);
			
	        for( int i = 0 ; i < datos.length ; i++ ) {
	            double numero1 = Integer.parseInt(datos[i]);
	            
	            // Obtener el siguiente número del vector
	            int numero2Index = i + 1;
	            if(numero2Index >= datos.length) {
	                numero2Index = 0; // Volver al primer número del vector
	            }
	            
	            double numero2 = Integer.parseInt(datos[numero2Index]) - 3;
	            
	            String resultado = "";
	            try {
	            	double result = numero1 / numero2;
	                resultado += result;
	            } catch (NumberFormatException | ArithmeticException e) {
	                pwr.println(datos[i] + " / " + datos[i + 1] + " = " + "error: " + e.getMessage());
	                resultado = "Error: División por cero";
	            }
	            
	            // Escribir en el archivo de resultados
	            String linea = numero1 + " / " + numero2 + " = " + resultado;
	            pw.println(linea);
	        }
	        
	        fw.flush();
	        fwr.flush();
	        pw.close();
	        fw.close();
	        fwr.close();
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
	/*
	 * 
	 * 
	 *   PUNTO 3
	 * 
	 * 
	 */
	
	
	public static void generarArchivoResultadosYErrorDos(String[] datos) {
		String cadena = leer();
		String[] lineas = cadena.split("\n");
		
		File archivo = new File("resultadosDos.txt");
		File archivoError = new File("errorDos.txt");
		
		try {
			FileWriter fw = new FileWriter( archivo , true );
			PrintWriter pw = new PrintWriter(fw);

			FileWriter fwr = new FileWriter( archivoError , true );
			PrintWriter pwr = new PrintWriter(fwr);
			
			for( int i = 0 ; i < datos.length ; i++ ) {
                double numero1 = Integer.parseInt(datos[i]);
                int numero2 = 3;
                
                String resultado = "";
                try {
                    double result = numero1 / numero2;
                	resultado += result;
                    ps.println(result + ": ");
                } catch (NumberFormatException | ArithmeticException e) {
                	pwr.println(datos[i] + " / " + datos[i + 1] + " = " + "error: " + e.getMessage());
                    resultado = "Error: División por cero";
                }
                
                String linea = (numero1 + " / " + numero2 + " = " + resultado + "\n");
                pw.write(linea);
            }
		
			/*
			for( int i = 0; i < lineas.length; i++ ) {
				double numero1 = Double.parseDouble(lineas[i]);
                int numero2 = 3;
                
                String resultado = "";
                try {
                    double result = numero1 / numero2;
                    resultado += result;
                    pw.write(numero1 + " / " + numero2 + " = " + resultado + "\n");
                } catch (NumberFormatException | ArithmeticException e) {
                	pwr.println(lineas[i] + " / " + lineas[i + 1] + " = " + "error: " + e.getMessage());
                    resultado = "Error: División por cero";
                }
				
			}
			*/
			
			for (int i = 0; i < lineas.length - 1; i++) {
			    if (!lineas[i].isEmpty()) {
			        try {
			            double numero1 = Double.parseDouble(lineas[i]);
			            int numero2 = 3;

			            String resultado = "";
			            try {
			                double result = numero1 / numero2;
			                resultado += result;
			                pw.write(numero1 + " / " + numero2 + " = " + resultado + "\n");
			            } catch (NumberFormatException | ArithmeticException e) {
			                pwr.println(lineas[i] + " / " + lineas[i + 1] + " = " + "error: " + e.getMessage());
			                resultado = "Error: División por cero";
			            }
			        } catch (NumberFormatException e) {
			            // Manejar el error de formato de número inválido en lineas[i]
			            pwr.println("Dato inválido: " + lineas[i]);
			        }
			    }
			}
			
			
			
			
			fw.flush();
	        fwr.flush();
	        pw.close();
	        fw.close();
	        fwr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        

	}
	
	
	public static String leer() {
		   
		String texto="";
		try {
			
			FileReader fr = new FileReader("datos.txt");
			BufferedReader br = new BufferedReader( fr );
			
			String linea ="";
		
			while( (linea = br.readLine() ) !=  null) {
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
	
	
}
