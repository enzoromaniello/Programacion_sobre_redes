package EjerciciosGuia;

import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Ejercicio3 {
	public static void Ej3a() {
        String[] datos = funciones.ingresarDatosEnLista();

        PrintStream psf;
        File archivo = new File("hola.txt");

        try {
            psf = new PrintStream(new FileOutputStream( archivo , false ));
            if( datos.length > 0 ) {
                String ultimoDato = datos[ datos.length -1 ];
                psf.println(ultimoDato);
            } else {
                psf.println("No se han ingresado datos.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
	public static void Ej3b() {
        String[] datos = funciones.ingresarDatosEnLista();

        PrintStream psf;
        File archivo = new File("datos.txt");

        List<Integer> numerosLista = funciones.filtrarNumeros(datos);

        try {
            psf = new PrintStream(new FileOutputStream( archivo , false ));

            for (int numero : numerosLista) {
                psf.println(numero);
            }

            psf.close();
        } catch (IOException e) {
            System.out.println("Se produjo un error al crear o escribir en el archivo.");
            e.printStackTrace();
        }

    }
		
	
}
