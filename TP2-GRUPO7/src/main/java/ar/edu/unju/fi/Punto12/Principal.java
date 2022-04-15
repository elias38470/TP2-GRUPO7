package ar.edu.unju.fi.Punto12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double g = 9.81;
		double h;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese altura");
		h=teclado.nextDouble();
		
		System.out.print("Tiempo en el que tarda en caer un objeto de una altura = "+h+"mts --> "+Math.sqrt((h*2)/g));
		
	}

}
