package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//bloque de variables
		int num1,num2;
		int mcd=1;
		int mcm;
		
		// creamos scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el primer numero: ");
		num1=sc.nextInt();
		System.out.println("Introduzca el primer numero: ");
		num2=sc.nextInt();
		
		// creamos el bucle 
		for (int i=1;i<=num1 && i<=num2;i++) {
			if (num1%i==0 && num2%i ==0) {
				mcd=i;
			}
		}
		mcm= (num1*num2)/mcd;
		
		System.out.println("El mínimo comun multiplo es: "+mcm);
		
		//cerramos el scanner
		sc.close();
		

	}

}
