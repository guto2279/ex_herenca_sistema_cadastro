package com.wesley.ex.heranca;

public class Vendedor extends Empregado {
	private double valorVendas;
	private int qntVendas;
	
	public Vendedor() {
	
	}
	
	public Vendedor(String nome, int idade, String sexo, String endereco, String telefone, double salario,
			String matricula, double valorVendas, int qtdVendas) {
		super(nome, idade, sexo, endereco, telefone, salario, matricula);
		this.valorVendas = valorVendas;
		this.qntVendas = qtdVendas;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getQntVendas() {
		return qntVendas;
	}

	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}

	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", endereço=" + endereco + ", telefone =" + telefone + ", matricula=" + matricula + ", idade=" + idade 
				+ ", sexo=" + sexo + ", valorVendas=" + valorVendas + ", qntVendas=" 
				+ qntVendas + ", salario=" + salario +  "]";
	}
	
	
	
	
	
}
