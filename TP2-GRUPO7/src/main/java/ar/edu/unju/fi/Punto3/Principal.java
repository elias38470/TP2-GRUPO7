package ar.edu.unju.fi.Punto3;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	int num;
	
	  System.out.println("Ingrese 5 numeros");
	  
	  //Estructura repetitiva
	  for (int i=1;i<=5;i++)
	  {
		  System.out.println("Ingrese");
		  
		  //Entrada de datos en estructura repetitiva
		  num = entrada.nextInt();
		  
		  //Evaluacion de numero, y mostrar en pantalla el resultado
		  if (num % 2 == 0)
		  {
			  System.out.println("El numero " + num +" es par");
			  
		  }else
			  
		  {
			  System.out.println("El numero " + num +" es impar");
		  }
		  
	          
	  }
	  

	}

}
