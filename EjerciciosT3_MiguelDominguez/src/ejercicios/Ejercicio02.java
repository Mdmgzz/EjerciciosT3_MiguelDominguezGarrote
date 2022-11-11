package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// bloque de variables
				int numero;				// se guarda el numero que introduzca el usuario
				int contador=0;
				//int contador=0;
				
				// creamos el scanner
				Scanner sc=new Scanner(System.in);
				// preguntamos al usuario por el numero
				System.out.println("Introduzca un numero: ");
				numero=sc.nextInt();
				
				//creamos el bucle 
				
				for(int i=2; i<=numero;i++) {
					if (numero%i==0) {
					contador++;
					
					}
				}
				System.out.println(contador);
				//cerramos scanner
				sc.close();

			}

	
}

