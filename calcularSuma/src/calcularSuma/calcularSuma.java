/*
 * Ejercicio 1: Hacer un programa que calcule e imprima 
 * la suma de tres números (ejemplo: calcular notas, calificaciones, etc):
 * */

package calcularSuma;

import java.util.Scanner;

public class calcularSuma {

	public static void main(String[] args) {

		// Para ingresar los datos del usuario
		
		Scanner entrada = new Scanner(System.in); 
		float nota1, nota2, nota3, suma; 

		// pedimos que ingrese las notas por separdo. Tambien se
		// podría pedir las tres notas a la vez
		System.out.println("Introduzca primera nota");
		nota1 = entrada.nextFloat();

		System.out.println("Introduzca segunda nota");
		nota2 = entrada.nextFloat();

		System.out.println("Introduzca tercera nota");
		nota3 = entrada.nextFloat();
		
		suma = nota1 + nota2 + nota3; // Sumamos las tres notas. 
		
		System.out.println("\nLa suma de las tres notas es: " + suma);

		System.out.println("\nLa media de tu nota es: " + suma/3);

		
	
	}

}
