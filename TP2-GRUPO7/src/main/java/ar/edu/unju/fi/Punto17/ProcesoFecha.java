package ar.edu.unju.fi.Punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {

	public LocalDate fecha1;
	public LocalDate fecha2;
	public LocalTime time1;
	public LocalTime time2;
	public LocalDateTime dateTime1;
	public LocalDateTime dateTime2;
	
	//Constructor #1
	public ProcesoFecha() {
		
	}
	//Constructor #2
	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}
	//Constructor #3
	public ProcesoFecha(LocalTime time1, LocalTime time2) {
	
		this.time1 = time1;
		this.time2 = time2;
	}
	//Constructor #4
	public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}
	
	//
	public LocalDate getFecha1() {
		return fecha1;
	}
	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}
	public LocalDate getFecha2() {
		return fecha2;
	}
	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}
	public LocalTime getTime1() {
		return time1;
	}
	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}
	public LocalTime getTime2() {
		return time2;
	}
	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}
	public LocalDateTime getDateTime1() {
		return dateTime1;
	}
	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}
	public LocalDateTime getDateTime2() {
		return dateTime2;
	}
	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}
	
	//Metodos
	
	public Period contarTiempoTranscurrido () {
		
		Period period = Period.between(fecha1,fecha2);
		return period;
	}
	
	
	public String formatearFecha(LocalDate fecha)
	{
		
		DateTimeFormatter formateado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formateado.format(fecha);
	}
	
	
	public String compararFechas()
	{
	
		
		if(fecha1.isAfter(fecha2))
		{
			return "La fecha" + formatearFecha(fecha1) + " es posterior a "+ formatearFecha(fecha2);
			
		}else if (fecha2.isAfter(fecha1))
				{
			return "La fecha " + formatearFecha(fecha1) + " es anterior a "+ formatearFecha(fecha2);
				}else
				{
					return "La fecha " + formatearFecha(fecha1) + " y la fecha "+ formatearFecha(fecha2) + " son iguales";
				}
		
	}
	
	
	}
	
	
	
	
	

