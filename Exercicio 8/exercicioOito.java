
import java.util.Scanner;

public class exercicioOito {

	public static void main(String[] args) {
		
		System.out.println("---Exerc�cio 8---");
		System.out.println();
		System.out.println("Entre com um n�mero: ");
		Scanner scan = new Scanner(System.in);
		
		boolean valorValido = false;
		
		do {
			int valor = scan.nextInt();
			if(valor >=0 && valor ==10) {
				valorValido = true;
				System.out.println("Voc� digitou um n�mero " + valor + " fim do programa! ");
			} else {
				//valorValido = false;
				System.out.println("Valor invalido, digite novamente");
			}
		}while(!valorValido);
		
		
	}
}
