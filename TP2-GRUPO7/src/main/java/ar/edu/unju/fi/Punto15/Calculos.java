package ar.edu.unju.fi.Punto15;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Calculos {
	
	public void calcularDatos(String nombre, String fecha) {
		
		System.out.println("******************************");
		System.out.println("Nombre: "+nombre);
		
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(fecha, formateador);
		
		System.out.println("Fecha de nacimiento: "+formateador.format(fechaNacimiento));
		Period edad = Period.between(fechaNacimiento, LocalDate.now());
		System.out.println("Edad: "+String.format("%d años", edad.getYears()));
		
		int dia = fechaNacimiento.getDayOfMonth();
		int mes = fechaNacimiento.getMonthValue();
		
		if((dia>=21 && mes==3) || (dia<20 && mes==4)) {
			System.out.println("Signo del zodiaco: Aries");
		}
		if((dia>=20 && mes==4) || (dia<22 && mes==5)) {
			System.out.println("Signo del zodiaco: Tauro");
		}
		if((dia>=21 && mes==5) || (dia<21 && mes==6)) {
			System.out.println("Signo del zodiaco: Geminis");
		}
		if((dia>=21 && mes==6) || (dia<23 && mes==7)) {
			System.out.println("Signo del zodiaco: Cancer");
		}
		if((dia>=23 && mes==7) || (dia<23 && mes==8)) {
			System.out.println("Signo del zodiaco: Leo");
		}
		if((dia>=23 && mes==8) || (dia<23 && mes==9)) {
			System.out.println("Signo del zodiaco: Virgo");
		}
		if((dia>=23 && mes==9) || (dia<23 && mes==10)) {
			System.out.println("Signo del zodiaco: Libra");
		}
		if((dia>=23 && mes==10) || (dia<22 && mes==11)) {
			System.out.println("Signo del zodiaco: Escorpio");
		}
		if((dia>=22 && mes==11) || (dia<22 && mes==12)) {
			System.out.println("Signo del zodiaco: Sagitario");
		}
		if((dia>=22 && mes==12) || (dia<20 && mes==1)) {
			System.out.println("Signo del zodiaco: Capricornio");
		}
		if((dia>=20 && mes==1) || (dia<19 && mes==2)) {
			System.out.println("Signo del zodiaco: Acuario");
		}
		if((dia>=19 && mes==2) || (dia<21 && mes==3)) {
			System.out.println("Signo del zodiaco: Picis");
		}
		
		
		if((dia>=21 && mes==12) || mes==1 || mes==2 || (dia<21 && mes==3)) {
			System.out.println("Estacion: Verano");
		}
		if((dia>=21 && mes==3) || mes==4 || mes==5 || (dia<21 && mes==6)) {
			System.out.println("Estacion: Otoño");
		}
		if((dia>=21 && mes==6) || mes==7 || mes==8 || (dia<21 && mes==9)) {
			System.out.println("Estacion: Invierno");
		}
		if((dia>=21 && mes==9) || mes==10 || mes==11 || (dia<21 && mes==12)) {
			System.out.println("Estacion: Primavera");
		}
	}
}
