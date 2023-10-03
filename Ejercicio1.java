package com;
import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		String nombre,apellido,completo;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		nombre=teclado.nextLine();
		
		System.out.println("Dime tu apellido");
		apellido=teclado.nextLine();
		System.out.print("¡Hola:" + nombre + " " + apellido + "!");
		
		
	}

}
