package ar.edu.unju.fi.Punto6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int nota=1;
		Scanner sc = new Scanner(System.in);
		while(nota!=0) {
			System.out.println("Ingrese valor: ");
			nota = sc.nextInt();
			if(nota>0) {
				if(nota==6) {
					System.out.println("El alumno Regulariza.");
				}
				if(nota>=7 && nota<=10) {
					System.out.println("El alumno Promociona.");
				}
				if(nota<6 && nota>=1) {
					System.out.println("El alumno Desaprueba.");
				}
			}else {
				System.out.println("Valor no permitido.");
			}
		}
	}
}
