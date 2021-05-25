package model;

public class ClienteEstrangeiro extends Pessoa{
	private int passaporte;
	private String enderecoHospedagem;
	private int cnhInter;
	private int periodoPermanencia;
	
	public ClienteEstrangeiro(String nome, int idade, int passaporte, int cnhInter, String enderecoHospedagem,
			int periodoPermanencia) {
		super(nome, idade);
		this.passaporte = passaporte;
		this.cnhInter = cnhInter;
		this.enderecoHospedagem = enderecoHospedagem;
		this.periodoPermanencia = periodoPermanencia;
	}

	public int getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(int passaporte) {
		this.passaporte = passaporte;
	}

	public String getEnderecoHospedagem() {
		return enderecoHospedagem;
	}

	public void setEnderecoHospedagem(String enderecoHospedagem) {
		this.enderecoHospedagem = enderecoHospedagem;
	}

	public int getCnhInter() {
		return cnhInter;
	}

	public void setCnhInter(int cnhInter) {
		this.cnhInter = cnhInter;
	}

	public int getPeriodoPermanencia() {
		return periodoPermanencia;
	}

	public void setPeriodoPermanencia(int periodoPermanencia) {
		this.periodoPermanencia = periodoPermanencia;
	}
	
	
}
