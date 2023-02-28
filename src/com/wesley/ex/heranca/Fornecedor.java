package com.wesley.ex.heranca;

public class Fornecedor extends Pessoa{
	
	double valorCredito;
	double valorDivida;
	

	public Fornecedor() {

	}

	public Fornecedor(String nome, int idade, String sexo, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, idade, sexo, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo(){
		return this.valorCredito - this.valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	@Override
	public String toString() {
		return "Fornecedor [nome=" + nome
				+ ", idade=" + idade + ", sexo=" + sexo + ", endereco=" + endereco + ", telefone=" + telefone + ", valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + ", Saldo="+ this.obterSaldo() + "]";
	}
	
	
}
