package EjerciciosGuia;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
	PrintStream ps = new PrintStream(System.out);
	public Ejercicio4() {
		int seguir = 1, numero;
		List<Integer> numeros = new ArrayList<Integer>();
		while(seguir == 1) {
			ps.println("Ingrese un número, -99 para terminar.");
			numero = Integer.parseInt(leer());
			if(numero != -99) {
				numeros.add(numero);
			}else{
				seguir = 0;
			}
			
		}
		mostrarResultado(numeros);
	}
	public void leerValores(List<Integer> numeros) {
		for(Integer num : numeros) {
			ps.println(num);
		}
	}
	public int sumarValores(List<Integer> numeros) {
		int suma = 0;
		for(Integer num : numeros) {
			suma += num;
		}
		return suma;
	}
	public void mostrarResultado(List<Integer> numeros) {
		ps.println("Números ingresados: ");
		leerValores(numeros);
		ps.println("Suma de los valores: "+sumarValores(numeros));
		ps.println("Promedio de los valores: "+sumarValores(numeros)/numeros.size());
	}
	public String leer() {
		InputStreamReader obj = new InputStreamReader(System.in);

		int Byte = 0;
		String cadena = "";

		try {
			while ((Byte = obj.read()) != '\n') {
				if (Byte != '\r')
					
				cadena += (char) Byte;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cadena;
	}
}