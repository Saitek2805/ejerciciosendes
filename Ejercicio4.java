package com;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numeroDia;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número del 1 al 7, le diré que día es");
		numeroDia=teclado.nextInt();
		
		switch (numeroDia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			
			
		}
	}

}
