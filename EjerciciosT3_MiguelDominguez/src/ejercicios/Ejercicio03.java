package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//bloque de variables
		int estrellas;				// guardara la altura y base deseada
		
		// creamos Scanner
		Scanner sc=new Scanner(System.in);
		
		//preguntamos al usuario
		System.out.println("Introduza la base y altura del triangulo deseadas: ");
		estrellas=sc.nextInt();
		
		//creamos el bucle 
		for ( int i=1;i<=estrellas;i++) {
			System.out.println("* ");
		}
		// cerramos scanner
		sc.close();
	}

}
