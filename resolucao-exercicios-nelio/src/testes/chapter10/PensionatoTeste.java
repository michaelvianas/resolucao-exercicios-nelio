/*
 * Resolução do exercício do pensionato da unidade 10
 * 
 * A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
*/

package testes.chapter10;

import java.util.Scanner;

public class PensionatoTeste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String quartos[] = new String[10];
		int quartosAlugados;
		
		for(int i=0; i<quartos.length; i++) {
			quartos[i] = null;
		}
		
		System.out.print("Quantos quartos serão alugados? ");
		quartosAlugados = leia.nextInt();
		leia.nextLine();
		String hospedes[] = new String[quartosAlugados]; 
		
		for(int j=0; j<quartosAlugados; j++) {
			System.out.println();
			System.out.println("Reserva " + (j+1));
			System.out.print("Nome: ");
			String hospede = leia.nextLine();
			leia.nextLine();
			System.out.print("Email: ");
			String email = leia.nextLine();
			leia.nextLine();
			System.out.print("Quarto a ser alugado de 0 a 9: ");
			int nQuarto = leia.nextInt();
			leia.nextLine();
			hospedes[j] = hospede + ", " + email;
			quartos[nQuarto] = hospedes[j];
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for(int i=0; i<quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
	}
}
