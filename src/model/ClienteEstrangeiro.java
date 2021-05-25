package model;

public class ClienteEstrangeiro extends Cliente{
	private int passaporte;
	private String enderecoHospedagem;
	private int cnhInter;
	private int periodoPermanencia;
	
	public ClienteEstrangeiro(int passaporte, String enderecoHospedagem, int cnhInter, int periodoPermanencia) {
		super();
		this.passaporte = passaporte;
		this.enderecoHospedagem = enderecoHospedagem;
		this.cnhInter = cnhInter;
		this.periodoPermanencia = periodoPermanencia;
	}

	public int getPassaporte() {
		return this.passaporte;
	}

	public void setPassaporte(int passaporte) {
		this.passaporte = passaporte;
	}

	public String getEnderecoHospedagem() {
		return this.enderecoHospedagem;
	}

	public void setEnderecoHospedagem(String enderecoHospedagem) {
		this.enderecoHospedagem = enderecoHospedagem;
	}

	public int getCnhInter() {
		return this.cnhInter;
	}

	public void setCnhInter(int cnhInter) {
		this.cnhInter = cnhInter;
	}

	public int getPeriodoPermanencia() {
		return this.periodoPermanencia;
	}

	public void setPeriodoPermanencia(int periodoPermanencia) {
		this.periodoPermanencia = periodoPermanencia;
	}
	
	
	
}
