package ar.edu.unju.fi.Punto1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int resultado = 1 ;
		
       System.out.println("Ingrese un numero");
       do
       {
       numero1 = entrada.nextInt();
       
       if(numero1 < 0 || numero1 >10)
       {
    	   System.out.println("El numero ingresa deber entre 0 y 10");
       }
      
       }while(numero1 < 0 || numero1 >10);
       
       for(int i=numero1; i>0 ; i--)
       {
    	 resultado=resultado*i;
       }
       System.out.println(resultado);
		

	}

}
