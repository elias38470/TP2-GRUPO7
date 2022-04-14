package ar.edu.unju.fi.Punto2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un año: ");
		int año = sc.nextInt();
		if(año%4==0) {
			if(año%100!=0) {
				System.out.println(año+" es biciesto");
			}else {
				System.out.println(año+" NO es biciesto");
			}
		}else {
			if(año%400==0) {
				System.out.println(año+" es biciesto");
			}else {
				System.out.println(año+" NO es biciesto");
			}
		}
	}
}
