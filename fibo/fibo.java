package fibo;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		System.out.println("----Exercício 7 ----");
		System.out.println();
		System.out.println("--FIBONACCI");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um valor: ");
		int n = scan.nextInt();
		
		int valor1 = 1;
		int valor2 = 1;
		int proximo;
		
		
		for(int i = 3; i<=n; i++) {
			
			proximo = valor1 + valor2;
			valor1 = valor2;
			valor2 = proximo;
			
			System.out.println(proximo);
		}
		System.out.println("FIM");
	}

}
