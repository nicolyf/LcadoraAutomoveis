package controller;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class ControladorPessoa {
	private static ControladorPessoa controladorPessoa;
	private List<Pessoa> listaPessoas;

	public ControladorPessoa() {
		this.listaPessoas = new ArrayList<>();
	}

	public static ControladorPessoa getInstancia() {
		if (controladorPessoa == null) {
			controladorPessoa = new ControladorPessoa();
		}
		return controladorPessoa;
	}
	public List<Pessoa> getListaPessoas() {
		return listaPessoas;
	}
}
