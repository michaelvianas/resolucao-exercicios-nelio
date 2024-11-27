package classes;

public class Retangulo {
	private double altura;
	private double largura;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double calcularArea(double altura, double largura) {
		return altura * largura;
	}
	
	public double calcularPerimetro(double altura, double largura) {
		return 2 * (altura + largura);
	}
	
	public double calcularHipotenusa(double altura, double largura) {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
	}
}