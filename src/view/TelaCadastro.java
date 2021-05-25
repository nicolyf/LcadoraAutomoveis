package view;

import controller.ControladorPessoa;
import model.Cliente;
import model.ClienteEstrangeiro;
import model.Pessoa;

public class TelaCadastro extends Tela {

	public void cadastroCliente() {
		
		System.out.println("Informe os dados do cliente: ");
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Pressione \n 1 - Para cliente estrangeiro \n 2 - Para cliente nacional");
		int tipoCliente = sc.nextInt();
		Pessoa novoCliente;
		
		if (tipoCliente > 2 || tipoCliente < 1) {
			System.out.println("Op��o inv�lida! ");
		}
		
		if (tipoCliente == 1) {
			System.out.println("Passaporte: ");
			int passaporte = sc.nextInt();
			System.out.println("Carteira internacional de habilita��o: ");
			int cnhInter = sc.nextInt();
			System.out.println("Endere�o de hospedagem: ");
			sc.next();
			String enderecoHosp = sc.next();
			System.out.println("Per�do de perman�ncia (dias): ");
			int periodoPermanencia = sc.nextInt();
			novoCliente = new ClienteEstrangeiro(nome, idade, passaporte, cnhInter, enderecoHosp, periodoPermanencia);
		} else {
			System.out.println("CPF: ");
			int cpf = sc.nextInt();
			System.out.println("CNH: ");
			int cnh = sc.nextInt();
			System.out.println("Endere�o: ");
			String endereco = sc.next();
			novoCliente = new Cliente(nome, idade, endereco, cpf, cnh);
		}
		
		ControladorPessoa.getInstancia().getListaPessoas().add(novoCliente);
	}
}
