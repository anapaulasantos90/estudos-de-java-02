package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Departamento;
import entities.Funcionario;
import repositories.FuncionarioRepository;

/*
 * Classe de controle para operações com funcionário
 */
public class FuncionarioController {

	/*
	 * Método para realizar o cadastro de um funcionário
	 */
	public void cadastrarFuncionario() {
		
		try {
			
			System.out.println("\n*** CADASTRO DE FUNCIONÁRIO ***\n");
			
			//criando um objeto da classe Funcionário
			Funcionario funcionario = new Funcionario();
			
			//instanciando o atributo departamento contido em funcionário
			funcionario.setDepartamento(new Departamento());
			
			//gerando um ID aleatório para o funcionário
			funcionario.setId(UUID.randomUUID());
			
			//criando um objeto para a classe Scanner
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("NOME DO FUNCIONÁRIO...: ");
			funcionario.setNome(scanner.nextLine());
			
			System.out.print("CPF...................: ");
			funcionario.setCpf(scanner.nextLine());
			
			System.out.print("MATRÍCULA.............: ");
			funcionario.setMatricula(scanner.nextLine());
			
			System.out.print("SALÁRIO...............: ");
			funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
			
			//gerando um ID aleatório para o departamento do funcionário
			funcionario.getDepartamento().setId(UUID.randomUUID());
			
			System.out.print("SIGLA DO DEPTO........: ");
			funcionario.getDepartamento().setSigla(scanner.nextLine());
			
			System.out.print("DESCRIÇÃO DO DEPTO....: ");
			funcionario.getDepartamento().setDescricao(scanner.nextLine());
			
			//criando um objeto para a classe FuncionarioRepository
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarParaTxt(funcionario);
			
			//fechando o scanner
			scanner.close();			
		}
		catch(Exception e) {
			
			//imprimindo mensagem de erro..
			System.out.println("\nFALHA AO CADASTRAR FUNCIONÁRIO!");
			System.out.println("\nERRO: " + e.getMessage());
		}		
	}
}
