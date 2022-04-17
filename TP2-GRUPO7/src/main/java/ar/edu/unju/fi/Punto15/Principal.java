package ar.edu.unju.fi.Punto15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombrePersona;
		String fechaN;
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		nombrePersona = scanner.nextLine();
		
		System.out.println("Ingrese su fecha de nacimiento: (dd/mm/aaaa)");
		fechaN = scanner.next();
		
		Calculos datos = new Calculos();
		datos.calcularDatos(nombrePersona, fechaN);
		
	}

}
