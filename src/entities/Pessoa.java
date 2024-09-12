package entities;

import java.util.UUID;

/*
 * Classe de entidade
 */
public class Pessoa {

	/*
	 * Atributos da classe (dados)
	 */
	private UUID id;
	private String nome;

	/*
	 * Método para retornar o valor do id
	 */
	public UUID getId() {
		return id;
	}

	/*
	 * Método para receber/atribuir o valor do id
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	/*
	 * Método para retornar o valor do nome
	 */
	public String getNome() {
		return nome;
	}

	/*
	 * Método para receber/atribuir o valor do nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

}
