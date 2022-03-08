package teste;

public class TestaClasse {
 
	public static void main(String[] args) {
		Produto uva = new Produto();
		uva.nome = "uva";
		uva.preco = 3.99;
		uva.quantidade = 10;
		uva.valorTotal = 20;
		
		//boolean semDesconto = uva.quantidade <=10 ;
		
		if(uva.quantidade >=11 && uva.quantidade <= 21) {
			System.out.println("Desconto de 10% " 
		+ uva.nome + " Preço "  + uva.preco + " Valor a ser pago " + uva.valorTotal + " Unidades " + uva.quantidade);
			
		}else {
			boolean semDesconto = uva.quantidade <=10;
			if(semDesconto) {
				System.out.println("Menor que 10 unidades não tem direito ao desconto, será cobrado o valor total  "
			+ uva.nome + " Preço "  + uva.preco + " Valor a ser pago " + uva.valorTotal + " Unidades " + uva.quantidade);
			}
			if(uva.quantidade >=21 && uva.quantidade <=50) {
				System.out.println("Parabéns vc ganhou desconto de 20% " 
			+ uva.nome + " "  + uva.preco + " " + uva.valorTotal + " " + uva.quantidade);
			}
			if(uva.quantidade >=50) {
				System.out.println("Você ganha desconto de 25%  "
			+ uva.nome + " Preço "  + uva.preco + " Valor a ser pago " + uva.valorTotal + " unidades " + uva.quantidade);
			}
		}
	}
}
