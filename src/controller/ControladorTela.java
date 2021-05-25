package controller;

import view.TelaCadastro;

public class ControladorTela {
	private static ControladorTela controladorTela;
	
	public static ControladorTela getInstancia() {
		if (controladorTela == null) {
			controladorTela = new ControladorTela();
		}
		return controladorTela;
	}
	
	public void mostraTelaCadastro( ) {
		TelaCadastro telaCadastro = new TelaCadastro();
		telaCadastro.cadastroCliente();
	}	
}
