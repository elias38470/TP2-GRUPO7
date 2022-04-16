package ar.edu.unju.fi.Punto5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Declaracion
				Scanner entrada = new Scanner(System.in);
				boolean equivoco=true;
				int eval;
				
				//Estructura repetitiva, que finaliza cuando el mes no exista
			
				while(equivoco)
					{
					
					
					//entrada de datos
					System.out.println("Ingrese el numero de mes");
					eval = entrada.nextInt();
					
					 	switch (eval)
					 	{
					  
						case 1 :
							System.out.println("Corresponde al mes de Enero");
							break;
						case 2 :
							System.out.println("Corresponde al mes de Febrero");
							break;
						case 3 :
							System.out.println("Corresponde al mes de Marzo");
							break;
						case 4 :
							System.out.println("Corresponde al mes de Abril");
							break;
						case 5 :
							System.out.println("Corresponde al mes de Mayo");
							break;
						case 6 :
							System.out.println("Corresponde al mes de Junio");
							break;
						case 7 :
							System.out.println("Corresponde al mes de Julio");
							break;
						case 8 :
							System.out.println("Corresponde al mes de Agosto");
							break;
						case 9 :
							System.out.println("Corresponde al mes de Septiembre");
							break;
						case 10 :
							System.out.println("Corresponde al mes de Octubre");
							break;
						case 11 :
							System.out.println("Corresponde al mes de Noviembre");
							break;
						case 12 :
							System.out.println("Corresponde al mes de Diciembre");
							break;
			            default : 
			            	//cambio de valor en la bandera para finalizar el programa
			            	equivoco = false;
			            	System.out.println("No existe el mes");
						
						}
						
					}
					
				
			}

	}


