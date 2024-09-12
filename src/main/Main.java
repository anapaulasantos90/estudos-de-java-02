package main;

import controllers.FuncionarioController;

/*
 * Classe principal para execução do projeto
 */
public class Main {

	public static void main(String[] args) {

		// instanciando o controlador
		FuncionarioController funcionarioController = new FuncionarioController();

		// executando o método para cadastrar o funcionário
		funcionarioController.cadastrarFuncionario();
	}
}
