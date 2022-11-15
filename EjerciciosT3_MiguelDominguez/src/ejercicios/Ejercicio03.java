package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//bloque de variables
		int estrellas;					// guarda el alto y la base del triangulo
		// creamos scanner
		Scanner sc= new Scanner (System.in);
		
		// preguntamos al usuario
		System.out.println("Introduzca la base y altura del triangulo:");
		estrellas= sc.nextInt();
		// creamos el bucle 
		
		for ( int i=1; i<=estrellas;i++) {			// se inicia en 1 funciona mientras i es menor o igual que estrellas y va de 1 en 1
			for (int j=1;j<=estrellas-i;j++) {
				/*
				 * para poner los espacios, mientras la i es 1 la j se incia en 1 y trabaja hasta que es menor o igual que estrellas -i
				 * que en este caso es 3
				 * las 3 veces que se ejecuta escribira un espacio.
				 */
				System.out.print(" ");
			}
			for (int x=1; x<=i;x++) {
				/*
				 * pone las estrellas que forman el triangulo
				 * escribe el numero de estrellas que lleve la i es decir, si la 1 vale 1 como en la primera
				 * vuelta del bucle,se escribira 1 estrella y asi sucesivamente
				 */
				System.out.print("* ");
		}
			System.out.println();			// esto escribe el salto de linea
		}
		//cerramos el scanner
		sc.close();
		
		
		
	}
}