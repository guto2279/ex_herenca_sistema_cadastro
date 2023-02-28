package com.wesley.ex.heranca;

public class Gerente extends Empregado {
	
	private String nomeGerencia;


	public Gerente() {
		
	}
	
	public Gerente(String nome, int idade, String sexo, String endereco, String telefone, double salario,
			String matricula, String nomeGerencia) {
		super(nome, idade, sexo, endereco, telefone, salario, matricula);
		this.nomeGerencia = nomeGerencia;
	}




	public String getNomeGerencia() {
		return nomeGerencia;
	}


	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}


	@Override
	public String toString() {
		return "Gerente [nome="
				+ nome + ", endereço=" + endereco + ", telefone =" + telefone + ", matricula=" + matricula + ", idade=" + idade + ", sexo=" + sexo +", nomeGerencia=" + nomeGerencia + ", salario=" + salario + ", Valor do INSS: " + valorInss(this.salario) +  "]";
	}
	
	
	

}
