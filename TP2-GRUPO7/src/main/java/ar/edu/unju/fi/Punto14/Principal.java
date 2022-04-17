package ar.edu.unju.fi.Punto14;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   Scanner entrada = new Scanner(System.in);
		    
		    Empleado 	unempleado = new Empleado();
		    
		    System.out.println("ingrese las horas trabajadas");
		    unempleado.HorasTrabajadas = entrada.nextInt();
			
		    unempleado.Sueldo = unempleado.CalcularSueldo(unempleado.HorasTrabajadas);
		
			System.out.println(unempleado);
			*///Codigo del punto 13
			
		LocalDate fecha = LocalDate.of(2022, 3, 16);
		Empleado empl1 = new Empleado();
		Empleado empl2 = new Empleado("Juan fernandez",2578,120);
		Empleado empl3 = new Empleado("Carlos Fernando",fecha,100);
		Empleado empl4 = new Empleado("Pedro Cruz",120);
			System.out.println("1er " + empl1);
			System.out.println("2do " +empl2);
			System.out.println("3er " +empl3);
			System.out.println("4to " +empl4);
	}

	}

