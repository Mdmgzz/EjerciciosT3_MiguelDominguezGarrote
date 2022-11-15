package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// bloque de variables
				int num;					// se guarda el numero introducido
				// creamos scanner
				Scanner sc=new Scanner(System.in);
				
				//preguntamos al usuario
				System.out.println("Introduzca un numero: ");
				num=sc.nextInt();
			
				// creamos el bucle 
				for ( int i=1 ; i<=num;i++) {
					for (int j=1; j<=i; j++) {
						
						System.out.println();
					}
				}
				
				// cerramos scanner
				sc.close();

	}

}

