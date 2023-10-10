package com;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numero;
		int suma=0;
	
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número");
		numero=teclado.nextInt();
		
		for (int x=1;x<=numero;x++){
			suma= x + suma;
			
		}System.out.println("La suma detodos los número es: " + suma);
	}
}
