package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		/*
		 * Pruebas
		 * He probado con 
		 * 1= 1 cifra
		 * 233= 3 cifras
		 * 4555555= 7 cifras
		 * -45= Introduce un valor positivo
		 */
		long num; 						//se guarda el numero que nos va a introducir el usuario 
        long contador=0;				//contador. Utiliazo long porque caben mas cifras en un numero
		//creamos scanner
		Scanner sc=new Scanner(System.in);
			//solicitamos el numero al usuario
			System.out.println("Introduzca un numero: ");
			num= sc.nextLong();
			//comprobamos que el numero no es negativo
			if (num<=0){
				System.out.println("Introduce un valor positivo");
			}else {														//mientras el numero no sea igual a 0
				while(num!=0){											// se dividirá entre 10 y el contador aumentará
					num/=10;
					contador++;
					}
				if (contador==1) {
					System.out.println("El numero tiene "+contador+" cifra.");
				}else {
					System.out.println("El numero tiene "+contador+" cifras.");	// mostramos el resultado
				}
			}
			//cerramos scanner
			sc.close();
	}
}
