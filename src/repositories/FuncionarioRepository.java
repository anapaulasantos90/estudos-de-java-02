package repositories;

import java.io.PrintWriter;

import entities.Funcionario;

/*
 * Classe de repositório de dados para funcionário
 */
public class FuncionarioRepository {

	/*
	 * Método para receber um objeto funcionário
	 * e gravar os seus dados em um arquivo TXT
	 */
	public void exportarParaTxt(Funcionario funcionario) {
		
		try {
			
			//criando um arquivo TXT
			PrintWriter printWriter = new PrintWriter("c:\\temp\\funcionario_" + funcionario.getId() + ".txt");
			
			//escrevendo os dados do funcionário dentro do arquivo
			printWriter.write("\nID DO FUNCIONÁRIO..: " + funcionario.getId());
			printWriter.write("\nNOME...............: " + funcionario.getNome());
			printWriter.write("\nCPF................: " + funcionario.getCpf());
			printWriter.write("\nMATRICULA..........: " + funcionario.getMatricula());
			printWriter.write("\nSALÁRIO............: " + funcionario.getSalario());
			printWriter.write("\nSIGLA DO DEPTO.....: " + funcionario.getDepartamento().getSigla());
			printWriter.write("\nDESCRIÇÂO DO DEPTO.: " + funcionario.getDepartamento().getDescricao());
			
			printWriter.flush(); //salvar o arquivo
			printWriter.close(); //fechar o arquivo
			
			System.out.println("\nARQUIVO TXT GRAVADO COM SUCESSO!");
		}
		catch(Exception e) {
			
			System.out.println("\nFALHA AO GRAVAR ARQUIVO TXT:");
			System.out.println("\nERRO: " + e.getMessage());
		}
	}
}
