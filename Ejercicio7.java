package com;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numero,y;//numero es la variable que le pedimos al usuario
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número entre 1 al 10");
		numero=teclado.nextInt();
		
		for (y=1;y<=10;y++) {//y es la variable para temporal para el bucle
			System.out.println(numero + "x" + y + "=" + numero*y );
			
		}

	}

}
