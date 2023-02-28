package com.wesley.ex.heranca;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String sexo;
	protected String endereco;
	protected String telefone;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, String sexo, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	
	

}
