package ar.edu.unju.fi.Punto14;

import java.time.LocalDate;

public class Empleado {
	
	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + ", fecha=" + fecha + ", Legajo=" + Legajo + ", Email=" + Email
				+ ", Sueldo=" + Sueldo + ", HorasTrabajadas=" + HorasTrabajadas + "]";
	}

	public String	Nombre;
	public LocalDate fecha;
	public int Legajo;
	public String Email;
	public int Sueldo;
	public int HorasTrabajadas;
	
  public int CalcularSueldo(int horas) {
		if (horas <= 160) {
			Sueldo = horas * 600;
		}else {
			    Sueldo = 600 * 160;
				horas -= 160;
			for (double j= horas;j>0;j--) {
				Sueldo += 650;
			}
			
		}
	  return Sueldo;
  }

  
  //Constructores
  
 
public Empleado() {

}
public Empleado(String nombre, int legajo, int horasTrabajadas) {
	fecha = LocalDate.of(1900, 1, 1);
	Nombre = nombre;
	Legajo = legajo;
	HorasTrabajadas = horasTrabajadas;
}


public Empleado(String nombre, LocalDate fecha, int horasTrabajadas) {
	
	Nombre = nombre;
    Legajo = -9999;
	HorasTrabajadas = horasTrabajadas;
}


public Empleado(String nombre, int horasTrabajadas) {
  fecha = LocalDate.of(1900, 1, 1);
	Nombre = nombre;
	Legajo = -9999;
	HorasTrabajadas = horasTrabajadas;
}
 
}
