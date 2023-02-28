package com.wesley.ex.heranca;

public class Empregado extends Pessoa {

	protected double salario;
	protected String matricula;
	
	public Empregado() {
	
	}
	
	

	public Empregado(String nome, int idade, String sexo, String endereco, String telefone, double salario, String matricula) {
		super(nome, idade, sexo, endereco, telefone);
		this.salario = salario;
		this.matricula = matricula;
	}



	public double valorInss(double salario) {
		
		return this.salario * 11 / 100;
		 
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
