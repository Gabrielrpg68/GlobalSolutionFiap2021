package classes;

import java.util.Scanner;

public class AvaliacaoCliente {
	private int codigoAvaliacaoCliente;
	private int dataAvaliacao;
	private String comentario;
	private int nota;
	private Cliente nome;
	
	
	Scanner sc = new Scanner(System.in);
	
	public AvaliacaoCliente() {	
	}

	public AvaliacaoCliente(int codigoAvaliacaoCliente, int dataAvaliacao, String comentario) {
		this.codigoAvaliacaoCliente = codigoAvaliacaoCliente;
		this.dataAvaliacao = dataAvaliacao;
		this.comentario = comentario;
	}

	public int getCodigoAvaliacaoCliente() {
		return codigoAvaliacaoCliente;
	}

	public void setCodigoAvaliacaoCliente(int codigoAvaliacaoCliente) {
		this.codigoAvaliacaoCliente = codigoAvaliacaoCliente;
	}

	public int getDataAvaliacao() {
		return dataAvaliacao;
	}

	public void setDataAvaliacao(int dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Cliente getNome() {
		return nome;
	}

	public void setNome(Cliente nome) {
		this.nome = nome;
	}
	Parque parques = new Parque();

		
}

	
	
	
