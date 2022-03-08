package exercicios;

import java.util.Scanner;

public class jokenpo {

	public static void main(String[] args) {
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("-------Jokenpo-------");
		System.out.println("");
		System.out.println("1 pedra");
		System.out.println("2 tesoura");
		System.out.println("3 papel");
		System.out.println("");
		System.out.println("Digite a opção de sua escolha: ");

		// jogador
		jogador = teclado.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA ");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL ");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida, selecione uma opção válida.");
			break;

		}

		// computador

		computador = (int) (Math.random() * 3 + 1);// computador soteia n inteiro, x3 + 1, ou seja, se for 0 + 1 =1, se
		teclado.close(); // for 1+1=2 e se for 2+1=3

		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA ");
			break;
		case 2:
			System.out.println("Computador escolheu TESOURA ");
			break;
		case 3:
			System.out.println("Computador escolheu PAPEL");
			break;
		}

		System.out.println("");
		if (jogador == computador) {
			System.out.println("Houve um empate");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("Jogador ganhou, parabéns");
			} else {
				System.out.println("Computador ganhou!!");
			}
		}
	}
}
