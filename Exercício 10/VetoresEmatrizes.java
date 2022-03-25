
import java.util.Scanner;

public class VetoresEmatrizes {

	static final int LIN = 3; // constantes
	static final int COL = 3;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);// variavel input, pega o valor digitado
		int mat[][] = new int[LIN][COL]; // variavel mat chama constantes
		int dp = 0;                     // variavel diagonal principal
		
		//leitura
		for(int i = 0;  i <LIN; i++) { // para (variavel i igual a zero; i menor que linha, i++ incremento)
			for(int j = 0; j < COL; j++) { //para ( variavel j = 0; j menor que COLUNA; J++ incremento
				System.out.println("Informe um valor: "); // valor digitado pelo usuário
				mat[i][j] = input.nextInt(); // variavel mat recebe valor digitado
			}
		}
		// apresentação
		
		for(int i = 0;  i <LIN; i++) {
			for(int j = 0; j < COL; j++) {
				System.out.print("["+mat[i][j]+"]");
				
			}
			System.out.println("\n"); // pula linha
		}
		// diagonal
		for(int i = 0; i <LIN; i++) {
			for(int j = 0; j <COL; j++) {
				if(i==j) {  // se variavel i for igual a j executa o código abaixo
					dp = dp + mat[i][j]; // dp recebe o valor de dp + mat, no caso i e j
				}
			}
		}
		System.out.println("Diagonal principal eh: " + dp); // imprime na tela media da diagonal principal
	}
}
