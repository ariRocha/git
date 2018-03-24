import java.util.Scanner;

public class testeTeste {


		public static void main(String[] args) {

			double calculoPreco;
			double calculoDesconto = 0;
			double valorFinal = 0;
			
            Scanner scan1 = new Scanner(System.in);
            
			Scanner scan = new Scanner(System.in);

			System.out.println("Qual carne deseja comprar: file duplo, alcatra ou picanha? ");
			String tipoCarne = scan.nextLine();

			System.out.println("Quantos quilos? ");
			double kgCarne = scan.nextDouble();
			
			System.out.println("Qual o tipo de pagamento: cartão ou dinheiro? ");
			String usoCartao = scan1.nextLine();

			if ((tipoCarne.equals("file duplo")) && (kgCarne <= 5)) {
				calculoPreco = kgCarne * 4.90;
			} else {
				calculoPreco = kgCarne * 5.800;
			}

			if ((tipoCarne.equals("alcatra")) && (kgCarne <= 5)) {
				calculoPreco = kgCarne * 5.90;
			} else {
				calculoPreco = kgCarne * 6.80;
			}

			if ((tipoCarne.equals("picanha")) && (kgCarne <= 5)) {
				calculoPreco = kgCarne * 6.90;
			} else {
				calculoPreco = kgCarne * 7.80;
			}
			
			
			if (usoCartao.equals("cartão")) 
				calculoDesconto = (calculoPreco*0.05);
				valorFinal = (calculoPreco - calculoDesconto);
			  

			System.out.println("O tipo de carne escolhida foi: " + tipoCarne);
			System.out.println("A quantidade pedida foi de: " + kgCarne + "quilos");
			System.out.println("O preço total da compra foi: " + calculoPreco);
			System.out.println("O tipo de pagamento escolhido foi: " + usoCartao);
			System.out.println("O valor do desconto foi de: " + calculoDesconto + "reais");
			System.out.println("O valor a ser pago é de: " );
		}




	}


