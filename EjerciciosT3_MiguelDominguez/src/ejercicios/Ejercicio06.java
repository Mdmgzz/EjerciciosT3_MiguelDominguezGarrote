package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		 /*
		  * Pruebas
		  * he probado con el 15,0y 4
		  * 0=Introduce un numero entre 0 y 20
		  * 4= una piramide de 4 filas
		  * 15= una piramide de 15 filas 
		  */
		// bloque de variables
		int num;					// se guarda el numero introducido
		
		// creamos scanner
		Scanner sc=new Scanner(System.in);
		
		//preguntamos al usuario
		System.out.println("Introduzca un numero: ");
		num=sc.nextInt();
		
		
		// ponemos los limites
		if (num>20 || num <=0) {
			System.out.println("Introduce un numero entre 0 y 20");
		}else {															// si esta dentro de los limites
		// creamos el bucle 
		for ( int i=1 ; i<=num;i++) {									// funciona de 1 en 1 hasta llegar al valor del numero 
			for (int j=1; j<=i;j++) {									// va escribiendo el numero de la fila tantas veces como mayor sea la fila
			System.out.print(i);										
			}
			System.out.println();										// es un salto de linea
		}
		}
		// cerramos scanner
		sc.close();
	}

}
