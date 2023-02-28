package com.wesley.ex.heranca;

public class Cliente extends Pessoa{
	
	private double valorDivida;
	private int anoNascim;
	
	public Cliente() {

	}
	
	public Cliente(String nome, int idade, String sexo, String endereco, String telefone, double valorDivida, int anoNascim) {
		super(nome, idade, sexo, endereco, telefone);
		this.valorDivida = valorDivida;
		this.anoNascim = anoNascim;
	}



	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public int getAnoNascim() {
		return anoNascim;
	}
	public void setAnoNascim(int anoNascim) {
		this.anoNascim = anoNascim;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereço=" + endereco + ", telefone =" + telefone + ", idade="
				+ idade + ", sexo=" + sexo + ", anoNascim=" + anoNascim + ", valorDivida=" + valorDivida  +   "]";
	}
	
	
	
	
}
