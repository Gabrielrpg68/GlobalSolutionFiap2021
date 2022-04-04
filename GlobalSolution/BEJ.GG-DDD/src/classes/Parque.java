package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parque {
	
	Scanner sc = new Scanner(System.in);
	
	private int codigoParque;
	private String nomeParque;	
	private int avaliacaoDoParque;
	private String horarioDeFuncionamente;
	private String localizacao;
	private String linkDoSite;
	
	public List<Integer> codigoParqueList = new ArrayList<>();
	public List<String> nomeParqueList = new ArrayList<>();
	public List<Integer> avaliacaoParqueList = new ArrayList<>();
	public List<String> horarioList = new ArrayList<>();
	public List<String> localizacaoList = new ArrayList<>();
	public List<String> linkSiteList = new ArrayList<>();
	
	
	public Parque() {
	}
	

	public Parque(int codigoParque2, String nomeParque2, int avaliacaoDoParque2, String horarioDeFuncionamente2, String localizacao2, String linkDoSite2) {
		this.codigoParque = codigoParque2;
		this.nomeParque = nomeParque2;
		this.avaliacaoDoParque = avaliacaoDoParque2;
		this.horarioDeFuncionamente = horarioDeFuncionamente2;
		this.localizacao = localizacao2;
		this.linkDoSite = linkDoSite2;
	}
	
	

	public int getCodigoParque() {
		return codigoParque;
	}

	public void setCodigoParque(int codigoParque) {
		this.codigoParque = codigoParque;
	}

	public String getNomeParque() {
		return nomeParque;
	}

	public void setNomeParque(String nomeParque) {
		this.nomeParque = nomeParque;
	}

	public int getAvaliacaoDoParque() {
		return avaliacaoDoParque;
	}

	public void setAvaliacaoDoParque(int avaliacaoDoParque) {
		this.avaliacaoDoParque = avaliacaoDoParque;
	}

	public String getHorarioDeFuncionamente() {
		return horarioDeFuncionamente;
	}

	public void setHorarioDeFuncionamente(String horarioDeFuncionamente) {
		this.horarioDeFuncionamente = horarioDeFuncionamente;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getLinkDoSite() {
		return linkDoSite;
	}

	public void setLinkDoSite(String linkDoSite) {
		this.linkDoSite = linkDoSite;
	}
	
	public void addParque() {
		System.out.println("Quantos parques deseja adicionar? ");
		int n = sc.nextInt();
		for (int i = 0; i<n; i++) {
			System.out.print("Codigo do Parque: ");
			int codigoParque = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome do Parque: ");
			String nomeParque = sc.nextLine().stripLeading();
			System.out.print("Avaliação do Parque: ");
			int avaliacaoDoParque = sc.nextInt();
			sc.nextLine();
			System.out.print("Horario de Funcionamento: ");
			String horarioDeFuncionamente = sc.nextLine();
			System.out.print("Localização: ");
			String localizacao = sc.nextLine();
			System.out.print("Link do Site: ");
			String linkDoSite = sc.nextLine();
			System.out.println("Parque adicionado\n");
			
			codigoParqueList.add(i, codigoParque);
			nomeParqueList.add(i, nomeParque);
			avaliacaoParqueList.add(i, avaliacaoDoParque);
			horarioList.add(i, horarioDeFuncionamente);
			localizacaoList.add(i, localizacao);
			linkSiteList.add(i, linkDoSite);
		
		}
		
	}

	public void detalhesParque() {
		System.out.print("Sobre qual parque deseja ver informações? (Digite nome) ");
		String nome = sc.nextLine().stripLeading();
			if (nomeParqueList.contains(nome)) {
				int posicao = nomeParqueList.indexOf(nome);
				System.out.println("Nome: " + nomeParqueList.get(posicao));
				System.out.println("Codigo do Parque: " + codigoParqueList.get(posicao));
				System.out.println("Avaliação: " + avaliacaoParqueList.get(posicao));
				System.out.println("Horario de Funcionamento: " + horarioList.get(posicao));
				System.out.println("Localização: " + localizacaoList.get(posicao));
				System.out.println("Site: " + linkSiteList.get(posicao));
				System.out.println();
			}
			else {
				System.out.println("Parque não cadastrado");
			}
		
	}
	public void addAvaliacaoParque() {
		System.out.print("Qual o nome do parque que deseja avaliar? ");
		String nomeParque = sc.next().strip();
		System.out.println();
			if (nomeParqueList.contains(nomeParque)) {
				System.out.println("Qual o valor da nota? (0-5) ");
				int nota = sc.nextInt();
				int posicao = nomeParqueList.indexOf(nomeParque);
				avaliacaoParqueList.set(posicao, (nota));
				System.out.println("Avaliação atribuida com sucesso");
				System.out.println();
			}
			else {
				System.out.println("nome não pertence a nenhum parque cadastrado");
			}
	}
		
}

