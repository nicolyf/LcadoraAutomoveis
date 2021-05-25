package model;

public class Cliente {
	private String nome;
	private int idade;
	private int cnh;
	private int cpf;
	private String endereco;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, int idade, int cnh, int cpf, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.cnh = cnh;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getCnh() {
		return this.cnh;
	}
	
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	public int getCpf() {
		return this.cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
