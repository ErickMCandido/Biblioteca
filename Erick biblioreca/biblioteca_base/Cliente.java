package br.com.zaffari.biblioteca_base;


public class Cliente {
	private String nome;
	private int cpf;
	private int idade;

	//constructor com informações do cliente
	
	public Cliente(String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return " Nome do cliente: " + this.nome + ", idade: " + this.idade + " Cpf: " + this.cpf;
	}
}

