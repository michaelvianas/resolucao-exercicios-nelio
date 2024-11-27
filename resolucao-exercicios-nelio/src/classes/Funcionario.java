package classes;

public class Funcionario {
	private String nome;
	private double salarioBruto;
	private double taxa;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double getTaxa() {
		return taxa;
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double calcularSalarioLiquido() {
		return this.salarioBruto - this.taxa;
	}
	
	public double aumentarSalario(double acrescimo) {
		return (double) this.calcularSalarioLiquido() + this.salarioBruto * acrescimo;
	}
}
