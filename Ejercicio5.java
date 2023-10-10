package com;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int edad;
		
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduzca su edad");
		edad=teclado.nextInt();
		
		if (edad<12) {
			System.out.println("Infante");
		}else if (edad==12 || edad<=17) {
			System.out.println("Adolescente");
		}else if (edad==18 || edad<=60) {
			System.out.println("Adulto");
		}else {
			if (edad>60) {
				System.out.println("Anciano");
			}
		}

	}

}
