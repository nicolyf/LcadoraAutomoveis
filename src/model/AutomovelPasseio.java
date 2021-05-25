package model;

public class AutomovelPasseio extends Automovel {
	private boolean arCondicionado;
	private int numPortas;

	public AutomovelPasseio(int categoria, String placa, String marca, String modelo, int ano, int kmRodado, int kmInicial, boolean arCondicionado, int numPortas) {
		super(categoria, placa, marca, modelo, ano, kmRodado, kmInicial);
		this.arCondicionado = arCondicionado;
		this.numPortas = numPortas;
	}

	public boolean isArCondicionado() {
		return this.arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public int getNumPortas() {
		return this.numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
}
