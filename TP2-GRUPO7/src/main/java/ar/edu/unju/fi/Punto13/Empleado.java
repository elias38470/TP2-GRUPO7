package ar.edu.unju.fi.Punto13;

public class Empleado {
	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + ", fecha=" + fecha + ", Legajo=" + Legajo + ", Email=" + Email
				+ ", Sueldo=" + Sueldo + ", HorasTrabajadas=" + HorasTrabajadas + "]";
	}

	public String	Nombre;
	public int fecha;
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
}
