package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Pruebas
		 * He probado con el 7y23 , 12y24
		 * 7y21= El mínimo comun multiplo es: 161
		 * 12y24= El mínimo comun multiplo es: 24ç
		 * -2 y 2= El mínimo comun multiplo es: -4
		 */
		//bloque de variables
		int num1,num2;
		int mcd=1;
		int mcm;
		
		// creamos scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el primer numero: ");		// solicitamos el usuario el primner numero
		num1=sc.nextInt();
		System.out.println("Introduzca el primer numero: ");		// solicitamos al usuario el segundo numero
		num2=sc.nextInt();
		
		// creamos el bucle 
		for (int i=1;i<=num1 && i<=num2;i++) {						// sel bucle funciona hasta encontrar un numero que al dividir los dos
			if (num1%i==0 && num2%i ==0) {							// numeros introducidos por el usuario de resto salga 0
				mcd=i;												// lo guarda en una variable
			}
		}
		mcm= (num1*num2)/mcd;										// ahora solo multiplica esos numeros y los divides entre 2 para sacar 
																	// el minimo comun multiplo
		System.out.println("El mínimo comun multiplo es: "+mcm);	// muestra el resultado
		
		//cerramos el scanner
		sc.close();
		

	}

}
