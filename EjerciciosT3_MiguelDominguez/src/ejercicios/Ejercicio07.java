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
				for ( int i=1; i<=num;i++) {		// se inicia en 1 funciona mientras i es menor o igual que num y va de 1 en 1
					for (int j=1;j<=i;j++) {		// cuando la i vale dos, la j empieza a escribir por 1 hasta llegar al valor de i 
						System.out.print(j);	
					}
					for (int x=i-1;x>0;x--) {		// la desdendente funciotal tal que x es = a i-1 y se va escribiendo desde i-1 hasta 0
						System.out.print(x);
					}
					System.out.println();			// es un salto de linea
					}
				
				// cerramos scanner
				sc.close();

	}

}

