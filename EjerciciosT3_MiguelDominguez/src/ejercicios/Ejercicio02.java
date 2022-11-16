package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// bloque de variables
				int numero;				// se guarda el número que introduzca el usuario
				int contador=0;
				boolean primo = true;
				
				// creamos el scanner
				Scanner sc=new Scanner(System.in);
				// preguntamos al usuario por el numero
				System.out.println("Introduzca un numero: ");		
				numero=sc.nextInt();
				
				if (numero>0) {												// para que entre al bucle deberá ser mayor que 0
				//creamos el bucle 
				for (int i=2 ; i<=numero ; i++) {		// este bucle pasa desde el numero 2 hasta el numero introducido de 1 en 1 
				 primo= true;							
					for(int j = 2 ; j<i ; j++) {		// en el segundo  bucle se comprobará uno por uno desde el 2 hasta el numero introducido
						if (i%j==0) {					//si uno de los numeros tiene algun divisor entonces no será primo, y el bucle acabará
							primo=false;
							break;
							}
				
						}
					if (primo) {						// si despues de comprobar si tenia algun divisor, no lo ha tenido, es que es primo
						contador++;						// contador suma 1 y vuelve a empezar el bucle
					}
				}
				
				}else {
					System.out.println("Introduce un entero.");	// si se introduce un numero menor que 0 aparecerá esto 
				}
				System.out.println("Hay "+contador+" numeros primos.");		// muestra el resultado

				// scanner close
				sc.close();
	}
	
}

