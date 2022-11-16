package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
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
			
			while (num!=0) {
				contador++;
				System.out.println("Dime un numero: ");
				num=sc.nextInt();
			
				if (num>numinicial) {
					numinicial=num;
				}else {
					System.out.println("ERROR.");
					contadorfallos++;
				}
			}
			System.out.println("has introducido "+contador+" numeros.");
			System.out.println("has cometido "+contadorfallos+" fallos.");
		}
		// cerramos scanner
		sc.close();
	}

}
