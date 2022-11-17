package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 * Pruebas:
		 * He probado con el:
		 * 2= te pide el siguiente numero
		 * 1= te da error
		 * 6= continuas con el programa
		 * 3= da error 
		 * 0= se sale del programa
		 */
		// bloque de variables
		int numinicial;				// guarda el numero que introduzca el usuario
		int num = 1;
		int contador=0,contadorfallos=0;	// cuenta la cantidad de numeros introducidos y la cantidad de fallos 
		
		// creamos el scanner 
		Scanner sc=new Scanner(System.in);
		
		// preguntamos una vez al usuario para entrar al bucle
		System.out.println("Dime un numero: ");
		numinicial=sc.nextInt();
		if (numinicial<=0) {
			System.out.println("Introduzca un entero positivo");
		}else {
			//iniciamos el bucle
			
			while (num!=0) {								// el bucle funciona mientras este es distinto de 0 y positivo
				contador++;									// aumenta el contador para saber los numeros que llevamos introducidos
				System.out.println("Dime un numero: ");		// te pide el numero
				num=sc.nextInt();	
			
				if (num>numinicial){						// comprueba el el numero introducido es mayor que el inicial y si lo es,					
					numinicial=num;							// pone como numero inicial al mayor
				}else {
					System.out.println("ERROR.");			// si no es mayor, te devuelve error y te vuelve a preguntar.
					contadorfallos++;						// suma 1 al contador de fallos 
				}
			}
			System.out.println("has introducido "+contador+" numeros.");		// muestra el numero de veces que hemos introducido numeros
			System.out.println("has cometido "+contadorfallos+" fallos.");		// y los fallos
		}
		// cerramos scanner
		sc.close();
	}

}
