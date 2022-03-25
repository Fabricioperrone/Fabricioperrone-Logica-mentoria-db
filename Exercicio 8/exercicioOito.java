
import java.util.Scanner;

public class exercicioOito {

	public static void main(String[] args) {
		
		System.out.println("---Exercício 8---");
		System.out.println();
		System.out.println("Entre com um número: ");
		Scanner scan = new Scanner(System.in);
		
		boolean valorValido = false;
		
		do {
			int valor = scan.nextInt();
			if(valor >=0 && valor ==10) {
				valorValido = true;
				System.out.println("Você digitou um número " + valor + " fim do programa! ");
			} else {
				//valorValido = false;
				System.out.println("Valor invalido, digite novamente");
			}
		}while(!valorValido);
		
		
	}
}
