package Programas;

import java.util.Scanner;
import classes.DicasUteis;
import classes.Parque;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Parque parques = new Parque();
		DicasUteis dicas = new DicasUteis();
		
		System.out.println("Sobre oque deseja configurar agora? ");
		System.out.print("1- Parques de São Paulo\n2- Dicas sobre São Paulo\n3- Sair");
		int escolha = sc.nextInt();
		System.out.println();
		
		while (escolha != 3) {
			
			if(escolha == 1) {
				System.out.println("O que deseja fazer?");
				System.out.println();
				System.out.println("1- Adicionar um novo parque\n2- Avaliar um parque\n3- Ver detalhes sobre um parque");
				System.out.println();
				int escolha3 = sc.nextInt();
				if (escolha3 == 1) {
					parques.addParque();
				}
				else if(escolha3 == 2) {
					parques.addAvaliacaoParque();
				}
				else if(escolha3 == 3) {
					parques.detalhesParque();
				}
				else {
					System.out.println("Opção invalida");
				}
			}
			else if (escolha == 2) {
				System.out.println("O que deseja fazer?");
				System.out.println();
				System.out.println("1- Adicionar uma dica\n2- Detalhes sobre dicas");
				int escolha2 = sc.nextInt();
				if(escolha2 == 1) {
					dicas.addDicasUteis();
				}
				else if (escolha2 == 2) {
					dicas.detalhesDicas();
				}
				
		}
		
			System.out.println("Sobre oque deseja configurar agora? ");
			System.out.print("1- Parques de São Paulo\n2- Dicas sobre São Paulo\n3- Sair");
			escolha = sc.nextInt();
		
			
			
		}
		
		
		
		sc.close();
		

	}

}
