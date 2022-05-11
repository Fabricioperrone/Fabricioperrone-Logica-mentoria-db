package mentoria_logica;

import java.util.Scanner;

public class mediaAluno {

	public static void main(String[] args) {
		int nota1;
		int nota2;
		int nota3;
		int media;
		System.out.print("Insira uma nota: ");
		Scanner scan = new Scanner(System.in);
		nota1 = scan.nextInt();
		System.out.print("Insira uma nota: ");
		nota2 = scan.nextInt();
		System.out.print("Insira uma nota: ");
		nota3 = scan.nextInt();
		media = calculaMedia(nota1, nota2, nota3);
		System.out.println("A média do aluno é: \n " + media);
		scan.close();

		if (media >= 7) {
			System.out.println("Aprovado com média. APROVADO!. Média " + media);
		}
		if (media == 4 || media == 6) {
			System.out.println("Ver com seu tutor sobre, Verificação Suplementar. Média: " + media);
		} else {
			if (media <= 3) {
				System.out.println("Aluno, REPROVADO!  Média: " + media);
			}
		}
	}

	private static int calculaMedia(int nota1, int nota2, int nota3) {

		int media = (nota1 + nota2 + nota3) / 3;

		return media;

	}

}
