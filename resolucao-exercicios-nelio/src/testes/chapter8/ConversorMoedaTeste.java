package testes.chapter8;

import java.util.Scanner;

import classes.chapter8.ConversorMoeda;

public class ConversorMoedaTeste {
	public static void main(String[] args) {
		//ConversorMoeda conversor = new ConversorMoeda();
		Scanner leia = new Scanner(System.in);
		System.out.print("Entre com a quantidade de dólares a ser comprada: ");
		double quantidadeDolar = leia.nextDouble();
		
		System.out.println("A quantidade de reais para comprar é de " 
		+ ConversorMoeda.calcularReais(quantidadeDolar));
	}
}
