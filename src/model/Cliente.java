package model;

public class Cliente extends Pessoa{
	private int cnh;
	private int cpf;
	private String endereco;
	
	public Cliente(String nome, int idade, String endereco, int cnh, int cpf) {
		super(nome, idade);
		this.cnh = cnh;
		this.cpf = cpf;
		this.endereco = endereco;
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
