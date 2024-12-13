package testes.chapter8;

import java.util.Scanner;

import classes.chapter8.Funcionario;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Entre com o nome do funcionário: ");
		String nome = leia.nextLine();
		funcionario.setNome(nome);
		System.out.print("Entre com o seu salário bruto: ");
		double salarioBruto = leia.nextDouble();
		funcionario.setSalarioBruto(salarioBruto);
		System.out.print("Entre com a taxa em cima do salário: ");
		double taxa = leia.nextDouble();
		funcionario.setTaxa(taxa);
		
		System.out.println("Funcionário: " + funcionario.getNome() 
		+ ", $ " + String.format("%.2f", funcionario.calcularSalarioLiquido()));
		
		System.out.print("Percentual que será acrescido ao salário bruto: ");
		double acrescimo = leia.nextDouble();
		
		System.out.println("Salário atualizado: $ " + String.format("%.2f", funcionario.aumentarSalario(acrescimo)));
	}
}
