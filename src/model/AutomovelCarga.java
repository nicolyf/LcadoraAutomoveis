package model;

public class AutomovelCarga extends Automovel {
	private int capacidadeCarga;

	public AutomovelCarga(int categoria, String placa, String marca, String modelo, int ano, int kmRodado, int kmInicial, int capacidadeCarga) {
		super(categoria, placa, marca, modelo, ano, kmRodado, kmInicial);
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}	
}
