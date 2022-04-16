package ar.edu.unju.fi.Punto16;

import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		int n = teclado.nextInt();
		CalculoMatematico calculo = new CalculoMatematico(n);
		
		System.out.println("Sumatoria = "+ calculo.calcularSumatoria());
		System.out.println("Productoria = "+ calculo.calcularProductoria());

	}

}
