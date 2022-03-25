package random;

//import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		int random;
		int maxValor = 0;
		int minValor = 0;
		
		
	
	
		// gera numeros ate 10		
		for (int i= 0; i < 10; i++) {
			random = (int) (Math.random() * 100); // random ate 100
			if(i == 0) {
				maxValor = random;
				minValor = random;
			}else {
				if(random > maxValor) {// compara 
					maxValor = random;			
				}
				if(random < minValor) {
					minValor = random;
				}
			}
			
			System.out.println("Random: " + random);
			
		}
		System.out.println(" Máximo valor: " + maxValor + "\n Valor minimo:  " + minValor);
	

	}

}
