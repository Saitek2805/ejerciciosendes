package com;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int distancia,velocidad;//Valores dados a la distancia y a la velocidad(distancia,velocidad)
		float tiempo;
		float hora=3600;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime los kilometros que hay hasta el destino");
		distancia=teclado.nextInt();
		System.out.println("Dime la velocidad promedia que lleva el tren");
		velocidad=teclado.nextInt();
		tiempo= (distancia*velocidad)/hora;
		
		System.out.println("El tiempo que se tardará en llegar al sitio es:"+ tiempo + "h");

	}

}
