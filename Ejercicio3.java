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
			System.out.println("El primero es mayor");
		}else if (n2>n1 && n2>n3) {
			System.out.println("El segundo es mayor");
		}else if (n3>n1 && n3>n2) {
			System.out.println("El tercero es mayor");
		}else if(n1==n2 && n2>n3) {
			System.out.println("El primero y el segundo son los mayores");
		}else if(n2==n3 && n3>n1) {
			System.out.println("El segundo y el tercero son los mayores");
		}else if(n1==n3 && n3>n2) {	
			System.out.println("El primero y el tercero son los mayores"); 	
		}else {
			System.out.println("Los numeros son iguales");
		}
	}

}
