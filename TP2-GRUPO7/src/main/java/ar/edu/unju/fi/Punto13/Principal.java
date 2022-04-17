package ar.edu.unju.fi.Punto13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		   Scanner entrada = new Scanner(System.in);
		    
		    Empleado 	unempleado = new Empleado();
		    
		    System.out.println("ingrese las horas trabajadas");
		    unempleado.HorasTrabajadas = entrada.nextInt();
			
		    unempleado.Sueldo = unempleado.CalcularSueldo(unempleado.HorasTrabajadas);
		
			System.out.println(unempleado);
			
			
	}

	}

