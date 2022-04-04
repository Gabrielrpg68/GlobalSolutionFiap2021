package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DicasUteis {
	private int codigoDica;
	private String nome;
	private String detalheDaDica;
	
	private List<Integer> codigoDicaList = new ArrayList<>();
	private List<String> nomeDicaList = new ArrayList<>();
	private List<String> detalheDicaList = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public DicasUteis() {
	}

	public DicasUteis(int codigoDica, String nome, String detalheDaDica) {
		this.codigoDica = codigoDica;
		this.nome = nome;
		this.detalheDaDica = detalheDaDica;
	}

	public int getCodigoDica() {
		return codigoDica;
	}

	public void setCodigoDica(int codigoDica) {
		this.codigoDica = codigoDica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDetalheDaDica() {
		return detalheDaDica;
	}

	public List<Integer> getCodigoDicaList() {
		return codigoDicaList;
	}

	public void setCodigoDicaList(List<Integer> codigoDicaList) {
		this.codigoDicaList = codigoDicaList;
	}

	public List<String> getNomeDicaList() {
		return nomeDicaList;
	}

	public void setNomeDicaList(List<String> nomeDicaList) {
		this.nomeDicaList = nomeDicaList;
	}

	public List<String> getDetalheDicaList() {
		return detalheDicaList;
	}

	public void setDetalheDicaList(List<String> detalheDicaList) {
		this.detalheDicaList = detalheDicaList;
	}

	public void setDetalheDaDica(String detalheDaDica) {
		this.detalheDaDica = detalheDaDica;
	}

	public void addDicasUteis() {
		System.out.print("Quantas dicas deseja adicionar? ");
		int n = sc.nextInt();
		for (int i = 0; i<n; i++) {
			System.out.print("Codigo da Dica: ");
			int codDica = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome da dica: ");
			String nomeDica = sc.nextLine();
			System.out.print("Detalhes da Dica: ");
			String detalheDica = sc.nextLine();
			System.out.println("Dica criada");
			System.out.println();
			
			codigoDicaList.add(i, codDica);
			nomeDicaList.add(i, nomeDica);
			detalheDicaList.add(i, detalheDica);
		}
	}
	
	public void detalhesDicas() {
		System.out.print("Qual dica deseja ver sobre? (Digite nome) ");
		String dicaNome = sc.nextLine();
		
		if (nomeDicaList.contains(dicaNome)) {
			int posicao = nomeDicaList.indexOf(dicaNome);
			System.out.println("Codigo Dica: " + codigoDicaList.get(posicao));
			System.out.println("Nome: " + nomeDicaList.get(posicao));
			System.out.println("Detalhes da Dica: " + detalheDicaList.get(posicao));
			System.out.println();
		}
		else {
			System.out.println("Dica não cadastrada");
		}
			
		
		
	}
}
