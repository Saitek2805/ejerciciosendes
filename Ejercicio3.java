package com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número");
		n1=teclado.nextInt();
		System.out.println("Introduzca un segundo número");
		n2=teclado.nextInt();
		System.out.println("Introduzca un tercer número");
		n3=teclado.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("El primero es el mayor");
		}else if (n2>n1 && n2>n3) {
			System.out.println("El segundo es el mayor");
		}else{
			System.out.println("El tercero es el mayor");
		
		}
	}

}
