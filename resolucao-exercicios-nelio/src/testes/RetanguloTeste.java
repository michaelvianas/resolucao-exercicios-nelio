package testes;
import java.util.Locale;
import java.util.Scanner;

import classes.Retangulo;

public class RetanguloTeste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale locale = new Locale("en", "US");
		Retangulo novoRetangulo = new Retangulo();
		System.out.println("Entre com as dimensões da altura e largura: ");
		double altura = leia.nextDouble();
		double largura = leia.nextDouble();
		
		System.out.println("Área: " + novoRetangulo.calcularArea(altura, largura));
		System.out.println("Perímetro: " + novoRetangulo.calcularPerimetro(altura, largura));
		System.out.println("Hipotenusa: " + novoRetangulo.calcularHipotenusa(altura, largura));
	}
}