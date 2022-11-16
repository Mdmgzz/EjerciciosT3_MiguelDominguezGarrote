package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// bloque de variables
		int numinicial;
		int num;
		int aux=0;
		int cifra;
		
		// creamos scanner y preguntamos 
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un numero y te diré si es capicua: ");
		numinicial=sc.nextInt();
		
		// guardamos el valor de numinicial en otra variable para trabajar en ella
		num = numinicial;
		//ponemos limites
		if (numinicial<0) {
			System.out.println("Introduzca a partir de 0");			// comprobamos que el numero introducido este dentro del rango
		}else {
			// creamos el bucle
			while (num>0) {											// el bucle funciona mientras el num se mayor que 0
				cifra=num%10;					// sacamos la ultima cifra
				aux=aux*10+cifra;				//añadimos la ultima cifra a la variable aux
				num=num/10;						// y por ultimo quitamos la cifra que ya hemos añadido, así hasta que sea 0
			}
			if(aux==numinicial) {				// si la cifra dada la vuelta es igual a la inicial, es capicua, si no, no es capicua
				System.out.print("Es Capicua");
			}else {
				System.out.println("No Es Capicua");
			}
		}
		//cerramos scanner
		sc.close();
	}

}
