package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// bloque de variables
				int horas,minutos,segundos;		// se guarda las horas, minutos,segundos que introduzca el usuario
				int incremento;					// se guarda el incremento de seg que introduzca el usuario
				
				// creamos el scanner
				Scanner sc= new Scanner(System.in);
				//preguntamos por las horas,min,seg y el incremento
				System.out.println("Introduzca las horas: ");		// preguntamos por las horas
				horas=sc.nextInt();
				System.out.println("Introduzca los minutos: ");		// preguntamos por los minutos
				minutos=sc.nextInt();
				System.out.println("Introduzca los segundos: ");	// preguntamos por los segundos
				segundos=sc.nextInt();
				System.out.println("Introduzca el incremento de segundos: ");	// preguntamos por el incremento
				incremento=sc.nextInt();
				
				// creamos el bucle
				
				for (int i=0; i<incremento;i++) {			// comenzamos el bucle en 0 y trabaja mientras sea menor que el incremento, suma de 1 en 1 
					if (segundos==59){						// si los segundos son 59 se pondran a 0
						segundos=0;
						if (minutos==59) {					// si los minutos son 59 se pondran a 0
							minutos=0;
							if(horas==23) {					// si las horas sin 23 se pondran a 0
								horas=0;					
							}else {
								horas++;					// si no son 23 se suma 1 
							}
						}else {
							minutos++;						// si no son 59 se sumará 1
						}
					}else {
						segundos++;							// si no son 59 se sumará 1
					}
				}

				System.out.println(horas + ":" + minutos + ":" + segundos);
				
				//cerramos el scanner
				sc.close();
			}

		

}
	





