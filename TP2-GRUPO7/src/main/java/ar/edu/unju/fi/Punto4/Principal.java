package ar.edu.unju.fi.Punto4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	    
		int num;
		
		do
		{
			System.out.println("ingrese un numero");
			num = entrada.nextInt();	
			
			/*if (num >= 1 && num <= 12)
			  System.out.println("si pertenece a un mes");
			*/
		if (num == 1 )
		System.out.println("enero");
		if (num == 2 )
			System.out.println("febrero");
		if (num == 3 )
			System.out.println("marzo");
		if (num == 4 )
			System.out.println("abril");
		if (num == 5 )
			System.out.println("mayo");
		if (num == 6 )
			System.out.println("junio");
		if (num == 7 )
			System.out.println("julio");
		if (num == 8 )
			System.out.println("agosto");
		if (num == 9 )
			System.out.println("septiembre");
		if (num == 10 )
			System.out.println("octubre");
		if (num == 11 )
			System.out.println("noviembre");
		if (num == 12 )
			System.out.println("diciembre");
		}while (num >= 1 && num <= 12);

			System.out.println("no existe ese mes");

	}

	}


