package EjerciciosGuia;

import java.io.PrintStream;
import EjerciciosGuia.funciones;

public class Ejercicio1 {
	
	static PrintStream ps = new PrintStream(System.out);
	
	public static void Ej1a() {
		ps.println("Pago por hora: ");
		int ph = Integer.parseInt(funciones.leer());
		
		ps.println("Horas trabajadas: ");
		int ht = Integer.parseInt(funciones.leer());
		
		int SueldoBruto = ph * ht;
		
		ps.println("");
		ps.println( "El sueldo bruto es de: " + SueldoBruto );
	}
	
	
	public static void Ej1b() {
		ps.println("Ingrese el valor de los dos angulos interiores del triangulo: ");

	    double angulo1 = Double.parseDouble(funciones.leer());
	    double angulo2 = Double.parseDouble(funciones.leer());

	    double angulo3 = 180 - angulo1 - angulo2;

	    ps.println("");
	    ps.println("El valor del tercer ángulo interior restante es: " + angulo3);
	}
	
	
	public static void Ej1c() {
		ps.print("Ingrese la superficie del cuadrado (en m2): ");
		
		double superficie = Double.parseDouble(funciones.leer());
		
		double lado = Math.sqrt(superficie);
		double perimetro = 4 * lado;
		
		ps.println();
		ps.println("El perímetro del cuadrado es: " + perimetro + " metros");
	}
	
	
	public static void Ej1d() {
		ps.print("Ingrese la temperatura en grados Fahrenheit: ");
		
		double tempFahrenheit = Double.parseDouble(funciones.leer());
		
		double tempCentigrados = (tempFahrenheit - 32) * 5 / 9;
		
		ps.println();
		ps.println("La temperatura en grados centígrados es: " + tempCentigrados + " grados");
	}
	
	
	public static void Ej1e() {
		ps.print("Ingrese el tiempo en segundos: ");
		
		int tiempoSegundos = Integer.parseInt(funciones.leer());
		
		int dias = (tiempoSegundos / 86400);
		int horas = ((tiempoSegundos % 86400) / 3600);
		int minutos = ((tiempoSegundos % 3600) / 60);
		int segundos = (tiempoSegundos % 60);
		
		ps.println();
		ps.println("El tiempo es: " + dias + " días, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
	}
	
	
	public static void Ej1f() {
	    ps.print("Ingrese el precio del artículo: ");
	    double precio = Double.parseDouble(funciones.leer());
	
	    double descuento = precio * 0.1;
	    double precioPlan1 = precio - descuento;
	
	    double aumento = precio * 0.1;
	    double precioPlan2 = (precio + aumento) * 0.5;
	    double cuotasPlan2 = (precio + aumento - precioPlan2) / 2;
	
	    aumento = precio * 0.15;
	    double precioPlan3 = (precio + aumento) * 0.25;
	    double cuotasPlan3 = (precio + aumento - precioPlan3) / 5;
	
	    aumento = precio * 0.25;
	    double primeraPartePlan4 = (precio + aumento) * 0.15;
	    double segundaPartePlan4 = (precio + aumento - primeraPartePlan4) / 4;
	    double precioPlan4 = primeraPartePlan4 + (segundaPartePlan4 * 4);
	    double cuotasPlan4 = segundaPartePlan4;
	    
	    ps.println();
	    ps.println("Plan 1: $" + precioPlan1);
	    ps.println("Plan 2: $" + precioPlan2 + " (50% al contado y 2 cuotas de $" + cuotasPlan2 + ")");
	    ps.println("Plan 3: $" + precioPlan3 + " (25% al contado y 5 cuotas de $" + cuotasPlan3 + ")");
	    ps.println("Plan 4: $" + precioPlan4 + " (8 cuotas de $" + cuotasPlan4 + ")");
	}
	
	
	public static void Ej1g() {
		ps.print("Ingrese su signo zodiacal (sin mayúsculas ni acentos): ");
		String signo = funciones.leer();
		String mes = "";
		
		switch (signo) {
			case "aries":
	            mes = "Abril";
	            break;
	        case "tauro":
	            mes = "Mayo";
	            break;
	        case "geminis":
	            mes = "Junio";
	            break;
	        case "cancer":
	            mes = "Julio";
	            break;
	        case "leo":
	            mes = "Agosto";
	            break;
	        case "virgo":
	            mes = "Septiembre";
	            break;
	        case "libra":
	            mes = "Octubre";
	            break;
	        case "escorpio":
	            mes = "Noviembre";
	            break;
	        case "sagitario":
	            mes = "Diciembre";
	            break;
	        case "capricornio":
	            mes = "Enero";
	            break;
	        case "acuario":
	            mes = "Febrero";
	            break;
	        case "piscis":
	            mes = "Marzo";
	            break;
	        default:
	        	ps.println("");
	            ps.println("Signo zodiacal no válido.");
	            return;
		}
		
		ps.println("");
		ps.println("Su mes de nacimiento aproximado es: " + mes);
	}
}