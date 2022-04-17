package ar.edu.unju.fi.Punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//b.1
		System.out.println("********PUNTO 17)b1**********");
		LocalDate fecha1 = LocalDate.of(1978, 8, 26); 
		LocalDate fecha2= LocalDate.of(1988, 9, 28);
		
		ProcesoFecha pf1 = new ProcesoFecha(fecha1, fecha2);
		
		System.out.println( pf1.getFecha1() );
		System.out.println( pf1.getFecha2() );
		
		//b.2
		System.out.println("********PUNTO 17)b2**********");
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.now();
		
		ProcesoFecha pf2 = new ProcesoFecha(time1 , time2);
		
		pf2.setTime1( time1.plusHours(5) );
		System.out.println( pf2.getTime1() );
		
		pf2.setTime2( time1.minusMinutes(20) );
		System.out.println( pf2.getTime2() );
	    
		//b.3
		System.out.println("********PUNTO 17)b3**********");
		System.out.println(pf1.compararFechas() );
		
		//b.4
		System.out.println("********PUNTO 17)b4**********");
		
		/*
		LocalDate hoy = LocalDate.now();
		LocalTime ahora = LocalTime.now();*/
		
		LocalDateTime fecha3 = LocalDateTime.of(fecha1,time1 );
		LocalDateTime fecha4 = LocalDateTime.of(fecha2,time2 );
		
		ProcesoFecha pf3 = new ProcesoFecha(fecha3,fecha4);
		System.out.println(pf3.getDateTime1() );
		System.out.println(pf3.getDateTime2() );
		
		//b.5
		System.out.println("********PUNTO 17)b5**********");
		LocalDate fecha5 = LocalDate.of(2001,12,29);
		LocalDate fecha6 = LocalDate.now();
		
	    ProcesoFecha pf4 = new ProcesoFecha(fecha5,fecha6);
	    Period period = pf4.contarTiempoTranscurrido();
	    System.out.println("Han pasado " + period.getYears() +" Años " + period.getMonths() +" meses y " + period.getDays() +" dias desde la fecha " + pf4.formatearFecha(pf4.getFecha1()) +" hasta la fecha "+ pf4.formatearFecha(LocalDate.now()));
		
	    //b.6 y b.7
	    System.out.println("********PUNTO 17)b6-b7**********");
	    
	    boolean band;
	    Scanner scanner = new Scanner(System.in); 
	    LocalDate fechaLd = LocalDate.now();
	    
	    DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    
		   do {
	    	
	   
	    
	   	     try
		    {
	    band=false;
	    System.out.println("Ingresar una fecha (dd/MM/yyyy) : "); 
	    String fechaStr = scanner.next();
		fechaLd = LocalDate.parse(fechaStr, formateador);
		     }catch (DateTimeParseException e)
	     {
	    	System.out.println("Ingreso incorrecto, Ingresa con el formato solicitado");
           band=true;	    
    	     }
	       
	    }while(band==true);
		   
	ProcesoFecha pf5 = new ProcesoFecha();
    LocalDate nuevaFecha = fechaLd.plusDays(365);
	System.out.println(nuevaFecha);
	
	pf5.setFecha1(fechaLd);
		
		
	LocalDate fechaLd2 = LocalDate.now();
		
		do 
		{
			try
			{
		
	    System.out.println("Ingresar una fecha (dd/MM/yyyy) : "); 
		String fechaStr2 = scanner.next();
		fechaLd2 = LocalDate.parse(fechaStr2, formateador);
		
			} catch (DateTimeParseException d)	     {
	    	System.out.println("Ingreso incorrecto, Ingresa con el formato solicitado");
           band=true;	    
           }
		}while(band==true);
		
		pf5.setFecha2(fechaLd2);
		LocalDate nuevaFecha2 = fechaLd2.minusMonths(6);
		System.out.println(nuevaFecha2);
		

		
		 scanner.close();
	    
	}
	
	  

}
