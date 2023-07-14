package EjerciciosGuia;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream ps = new PrintStream(System.out);

	// Dados tres apellidos, la computadora los muestra ordenados alfabéticamente
	public static void Ej2a() {
        ps.println("Introduce tres apellidos para ordenarlos alfabéticamente:");
        String apellido1;
        ps.println("");
        
		try {
			apellido1 = br.readLine();
			String apellido2 = br.readLine();
	        String apellido3 = br.readLine();
	        
	        if (apellido1.compareTo(apellido2) < 0 ) {
	        	if (apellido1.compareTo(apellido3) < 0 ) {
	        		ps.println(apellido1);
	        		if (apellido2.compareTo(apellido3) < 0) {
	        			ps.println(apellido2);
	        			ps.println(apellido3);
	        		} else {
	        			ps.println(apellido3);
	        			ps.println(apellido2);
	        		}
	        	} else {
	        		ps.println(apellido3);
	                ps.println(apellido1);
	                ps.println(apellido2);
	        	}
	        } else {
	        	if (apellido2.compareTo(apellido3) < 0 ) {
	        		ps.println(apellido2);
	        		if (apellido1.compareTo(apellido3) < 0 ) {
	        			ps.println(apellido1);
	        			ps.println(apellido3);
	        		} else {
	        			ps.println(apellido3);
	        			ps.println(apellido1);
	        		}
	        	} else {
	        		ps.println(apellido3);
	        		ps.println(apellido2);
	        		ps.println(apellido1);
	        	}
	        }	
	    } catch (IOException e) {
			e.printStackTrace();
	    }
	}
	
	
	
	
	
	// 
	public static void Ej2b() {
        try {
	        ps.println("Ingrese cuatro números reales (sin coma):");
	        int num1 = Integer.parseInt(br.readLine());
	        int num2 = Integer.parseInt(br.readLine());
	        int num3 = Integer.parseInt(br.readLine());
	        int num4 = Integer.parseInt(br.readLine());
	
	        double numMenor = num1;
	        if (num2 < numMenor) {
	        	numMenor = num2;
	        	if (num3 < numMenor) {
	            	numMenor = num3;
	            	if (num4 < numMenor) {
	                	numMenor = num4;
	            	}
	        	}
	        }
	        
	        ps.println("");
	        ps.println("El número menor es: " + numMenor);
        } catch (IOException e) {
        	e.printStackTrace();
        }
    }
	
	
	
	
	
	// Dado un número, la computadora indica si es par o impar.
	public static void Ej2c() {
		try {
			ps.println("Ingrese un número sin coma: ");
			
	        int num = Integer.parseInt(br.readLine());
	        if(num % 2 == 0) {
	        	ps.println("");
	            ps.println(num + " es un número par.");
	        } else {
	        	ps.println("");
	            ps.println(num + " es un número impar.");
	        }
        } catch (IOException e) {
        	e.printStackTrace();
        }
	}
	
	
	
	
	
	// Dados dos números reales, la computadora indica si el mayor es divisible por el menor.
	public static void Ej2d() {
		try {
	        ps.println("Ingresa el primer número:");
	        double num1 = Double.parseDouble(br.readLine());
	        ps.println("Ingresa el segundo número:");
	        double num2 = Double.parseDouble(br.readLine());

	        double mayor = Math.max(num1, num2);
	        double menor = Math.min(num1, num2);

	        if (mayor % menor == 0) {
	        	ps.println("");
	            ps.println("El número mayor es divisible por el menor.");
	        } else {
	        	ps.println("");
	            ps.println("El número mayor no es divisible por el menor.");
	        }
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// Dada la fecha de nacimiento de una persona, la computadora muestra su signo del zodíaco.
	public static void Ej2e() {
		try {
			ps.println("Ingrese su fecha de nacimiento (formato dd/MM/yyyy): ");
	        String fechaNacimientoText = br.readLine();
	        
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	        Date fechaNacimiento;
			fechaNacimiento = formatter.parse(fechaNacimientoText);
			
			String signo = funciones.obtenerSignoZodiaco(fechaNacimiento);
			
			ps.println("");
	        ps.println("Su signo zodiacal es: " + signo);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
	}
	
	
	
	
	
	// Dado el nombre y apellido de 2 personas, la computadora muestra cuál de los 2 tiene el apellido más largo.
	public static void Ej2f() {
		try {
	        ps.println("Ingrese el nombre y apellido de la primera persona: ");
	        String[] nombreApellido1 = br.readLine().split(" ");
	        String apellido1 = nombreApellido1[nombreApellido1.length - 1];
	        ps.println("Ingrese el nombre y apellido de la segunda persona: ");
	        String[] nombreApellido2 = br.readLine().split(" ");
	        String apellido2 = nombreApellido2[nombreApellido2.length - 1];


	        if (apellido1.length() > apellido2.length()) {
	        	ps.println("");
	            ps.println(nombreApellido1[0] + " " + apellido1 + " tiene el apellido más largo.");
	        } else if (apellido1.length() < apellido2.length()) {
	        	ps.println("");
	            ps.println(nombreApellido2[0] + " " + apellido2 + " tiene el apellido más largo.");
	        } else {
	        	ps.println("");
	            ps.println("Ambos tienen apellidos de igual longitud.");
	        }
        }catch (IOException e) {
			e.printStackTrace();
        }
	}
	
	
	
	
	
	// Dado un entero N natural, la computadora muestra su tabla de multiplicar.
	public static void Ej2g() {
		try {
	        ps.print("Ingrese un número: ");

	        int n = Integer.parseInt(br.readLine());
	        
	        ps.println("");
	        
	        for (int i = 1; i <= 10; i++) {
	            ps.println(n + " x " + i + " = " + (n*i));
	        }
    	} catch (IOException e) {
			e.printStackTrace();
        }
	}
	
	// Dado un número natural, la computadora indica si es primo o no.
	public static void Ej2h() {
		try {
			boolean esPrimo = true;
	        ps.println("Ingrese un número natural:");
			int num = Integer.parseInt(br.readLine());
			
	        if (num == 1 || num == 0) {
	            ps.println(num + " no es un número primo ni compuesto.");
	            return;
	        }

	        for ( int i = 2 ; i <= num / 2 ; i++ ) {
	            if (num % i == 0) {
	                esPrimo = false;
	                break;
	            }
	        }

	        if (esPrimo) {
	        	ps.println("");
	            ps.println(num + " es un número primo.");
	        } else {
	        	ps.println("");
	            ps.println(num + " no es un número primo.");
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
        
	}
}
