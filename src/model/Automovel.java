package model;

public class Automovel {
	private int categoria;
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private int kmRodado;
	private int kmInicial;
	private int kmFinal;
	
	public Automovel(int categoria, String placa, String marca, String modelo, int ano, int kmRodado, int kmInicial) {
		this.categoria = categoria;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.kmRodado = kmRodado;
		this.kmInicial = kmInicial;
	}
	
	public Automovel(int categoria, String placa, String marca, String modelo, int ano, int kmRodado, int kmInicial, int kmFinal) {
		this.categoria = categoria;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.kmRodado = kmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}
	public void valorLocacao(int kmRodado) {
		int valorLocacao = kmRodado*this.valorKmRodado();
	}
	
	public int valorKmRodado( ) {
		int valorKmRodado = 0;
		if(this.getCategoria() == 1) {
			valorKmRodado = 25;
		}
		if(this.getCategoria() == 2) {
			valorKmRodado = 20;
		}
		if(this.getCategoria() == 3) {
			valorKmRodado = 15;
		}
		
		if(this.getCategoria() == 4) {
			valorKmRodado = 20;
		}
		
		return valorKmRodado;
	}
	
	public int getCategoria() {
		return this.categoria;
	}
	
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setPlaca(int placa) {
		this.placa = Integer.toString(placa);
	}
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getKmRodado() {
		return this.kmRodado;
	}
	
	public void setKmRodado(int kmRodado) {
		this.kmRodado = kmRodado;
	}
	
	public int getKmInicial() {
		return this.kmInicial;
	}
	
	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}
	
	public int getKmFinal() {
		return this.kmFinal;
	}
	
	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
	
	
}
