package EjerciciosGuia;

import java.io.PrintStream;

public class menu {

	public static void main(String[] args) {
		MenuPrincipal();
	}
	
	 public static void MenuPrincipal() {
        PrintStream ps = new PrintStream(System.out);

        ps.println("Seleccione un ejercicio");
        ps.println("0 - Salir");
        ps.println("1 - Ejercicio 1");
        ps.println("2 - Ejercicio 2");
        ps.println("3 - Ejercicio 3");
        ps.println("4 - Ejercicio 4");
        ps.println("");
        ps.println("Ejercicio Seleccionado:");

        int opcion = Integer.parseInt(funciones.leer());

        switch(opcion) {
            case 0:
                ps.println("has salido");
                break;
            case 1:
                MenuEjer1();
            case 2:
                MenuEjer2();
            case 3:
            	MenuEjer3();
            case 4:
            	MenuEjer4();
            default:
            	ps.println("");
                ps.println("Opción inválida. Por favor, ingrese una opción de las opciones disponibles.");
                MenuPrincipal();
        }
    }
	
	 

	// MENÃš EJERCICIO 1
	public static void MenuEjer1() {
        PrintStream ps = new PrintStream(System.out);
        
        ps.println("");
         
        ps.println("");
        ps.println("Seleccione un ejercicio");
        ps.println("");
        ps.println("0 - Salir");
        ps.println("1");
        ps.println("2");
        ps.println("3");
        ps.println("4");
        ps.println("5");
        ps.println("6");
        ps.println("7");
        ps.println("");
        ps.println("Ejercicio Seleccionado:");

        int opcion = Integer.parseInt(funciones.leer());

        switch(opcion) {
            case 0:
            	ps.println("");
                ps.println("Has salido");
                ps.println("");
                MenuPrincipal();
                break;
            case 1:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio1.Ej1a();
                MenuEjer1();
            case 2:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio1.Ej1b();
                MenuEjer1();
            case 3:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio1.Ej1c();
                MenuEjer1();
            case 4:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio1.Ej1d();
                MenuEjer1();
            case 5:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio1.Ej1e();
                MenuEjer1();
            case 6:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio1.Ej1f();
                MenuEjer1();
            case 7:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio1.Ej1g();
                MenuEjer1();
            default:
            	ps.println("");
                ps.println("Opción no valida");
                MenuEjer1();
        }
        ps.close();
    }
	
	
	
	
	// MENÃš EJERCICIO 2
	public static void MenuEjer2() {
        PrintStream ps = new PrintStream(System.out);
        
        ps.println("");
         
        ps.println("");
        ps.println("Seleccione un ejercicio");
        ps.println("");
        ps.println("0 - Salir");
        ps.println("1");
        ps.println("2");
        ps.println("3");
        ps.println("4");
        ps.println("5");
        ps.println("6");
        ps.println("7");
        ps.println("8");
        ps.println("");
        ps.println("Ejercicio Seleccionado: ");

        int opcion = Integer.parseInt(funciones.leer());

        switch(opcion) {
            case 0:
            	ps.println("");
                ps.println("Has salido");
                ps.println("");
                MenuPrincipal();
                break;
            case 1:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio2.Ej2a();
                MenuEjer2();
            case 2:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio2.Ej2b();
                MenuEjer2();
            case 3:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio2.Ej2c();
                MenuEjer2();
            case 4:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio2.Ej2d();
                MenuEjer2();
            case 5:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio2.Ej2e();
                MenuEjer2();
            case 6:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio2.Ej2f();
                MenuEjer2();
            case 7:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio2.Ej2g();
                MenuEjer2();
            case 8:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio2.Ej2h();
                MenuEjer2();
            default:
            	ps.println("");
                ps.println("Opcion no valida");
                MenuEjer2();
        }
        ps.close();
    }
	
	
	
	
	// MENÃš EJERCICIO 2
	public static void MenuEjer3() {
        PrintStream ps = new PrintStream(System.out);
        
        ps.println("");
         
        ps.println("");
        ps.println("Seleccione un ejercicio");
        ps.println("");
        ps.println("0 - Salir");
        ps.println("1");
        ps.println("2");
        ps.println("3");
        ps.println("4");
        ps.println("5");
        ps.println("6");
        ps.println("7");
        ps.println("");
        ps.println("Ejercicio Seleccionado:");

        int opcion = Integer.parseInt(funciones.leer());

        switch(opcion) {
            case 0:
            	ps.println("");
                ps.println("Has salido");
                ps.println("");
                MenuPrincipal();
                break;
            case 1:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio3.Ej3a();
                MenuEjer3();
            case 2:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio3.Ej3b();
                MenuEjer3();
            case 3:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio3.Ej3c();
                MenuEjer3();
            case 4:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio3.Ej3d();
                MenuEjer3();
            case 5:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio3.Ej3e();
                MenuEjer3();
            case 6:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio3.Ej3f();
                MenuEjer3();
            case 7:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio3.Ej3g();
                MenuEjer3();
            default:
            	ps.println("");
                ps.println("Opción no valida");
                MenuEjer3();
        }
        ps.close();
    }
	
	
	
	
	public static void MenuEjer4() {
        PrintStream ps = new PrintStream(System.out);
        
        ps.println("");
         
        ps.println("");
        ps.println("Seleccione un ejercicio");
        ps.println("");
        ps.println("0 - Salir");
        ps.println("1");
        ps.println("2");
        ps.println("3");
        ps.println("4");
        ps.println("5");
        ps.println("7");
        ps.println("");
        ps.println("Ejercicio Seleccionado:");

        int opcion = Integer.parseInt(funciones.leer());

        switch(opcion) {
            case 0:
            	ps.println("");
                ps.println("Has salido");
                ps.println("");
                MenuPrincipal();
                break;
            case 1:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio4.Ej4a();
                MenuEjer3();
            case 2:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio4.Ej4b();
                MenuEjer3();
            case 3:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio4.Ej4c();
                MenuEjer3();
            case 4:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio4.Ej4d();
                MenuEjer3();
            case 5:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio4.Ej4e();
                MenuEjer3();
            case 7:
            	ps.println("");
                ps.println("Ejercicio Seleccionado:");
                ps.println("");
                 
                ps.println("");
                Ejercicio4.Ej4g();
                MenuEjer3();
            default:
            	ps.println("");
                ps.println("Opción no valida");
                MenuEjer3();
        }
        ps.close();
    }
}