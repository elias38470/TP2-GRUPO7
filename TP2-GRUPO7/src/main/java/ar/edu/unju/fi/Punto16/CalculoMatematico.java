package ar.edu.unju.fi.Punto16;

public class CalculoMatematico {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public CalculoMatematico(int n) {
		super();
		this.n = n;
	}
	
	public double calcularSumatoria() {
		double sumatoria =0;
		for(int k=1;k<=n;k++) {
			sumatoria = sumatoria + Math.pow(((k*(k+1)/2)), 2);
		}
		
		return sumatoria;
	}
	
	public double calcularProductoria() {
		double productoria=1;
		for(int k=1;k<=n;k++) {
			productoria=productoria*(k*(k+4));
		}
		return productoria;
	}
}
