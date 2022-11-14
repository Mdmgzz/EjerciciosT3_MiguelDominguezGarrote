package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// bloque de variables
				int numero;				// se guarda el numero que introduzca el usuario
				int contador=0;
				boolean primo = true;
				
				// creamos el scanner
				Scanner sc=new Scanner(System.in);
				// preguntamos al usuario por el numero
				System.out.println("Introduzca un numero: ");
				numero=sc.nextInt();
				
				if (numero>0) {
				//creamos el bucle 
				for (int i=2 ; i<=numero ; i++) {
				 primo= true;
					for(int j = 2 ; j<i ; j++) {
						if (i%j==0) {
							primo=false;
							break;
							}
				
						}
					if (primo) {
						contador++;
					}
				}
				
				}else {
					System.out.println("Introduce un entero.");
				}
				System.out.println("Hay "+contador+" numeros primos.");

				// scanner close
				sc.close();
	}
	
}

