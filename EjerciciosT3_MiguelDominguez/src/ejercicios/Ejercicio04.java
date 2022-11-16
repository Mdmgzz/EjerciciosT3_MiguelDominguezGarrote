package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// bloque de variables
		int i;
		int num1;
		int num2;
		int menor;
		
		try (// creamos scanner y preguntamos por dos numeros
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduzca el primer numero");						// se introduce el primer numero
			num1=sc.nextInt();	
			System.out.println("Introduzca el segundo numero numero");				// se introduce el segundo numero
			num2=sc.nextInt();
			
			if(num1>num2) {		// si num1 mayor que num2 , num 2 será el menor
				menor=num2;
}else {
			menor=num1;			// su num 2 es mayor que num 2, num 1 será el menor
}
				
			// creamos bucle 
			for (i=menor; i>0;i--) {		// funciona mientras i sea mayor que 0
				if (num1%i==0 && num2%i==0) {		// si al dividir num1 entre i da 0 y lo mismo con num2, ese numero será el maximo divisor
					System.out.println("El maximo comun divisor es: "+i);
					break;
				}
			}
			// cerramos scanner
			sc.close();
		}
	}

}
