package testes.chapter8;
import java.util.Locale;
import java.util.Scanner;

import classes.chapter8.Retangulo;

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