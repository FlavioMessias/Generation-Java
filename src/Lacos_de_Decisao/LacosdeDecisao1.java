package Lacos_de_Decisao;

	import java.util.Scanner;
	public class LacosdeDecisao1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
			int n1, n2, n3, nmaior = 0;
			
				System.out.println("Entre com o primeiro número inteiro: ");
					n1 = ler.nextInt();
				System.out.println("Entre com o segundo número inteiro: ");
					n2 = ler.nextInt ();
				System.out.println("Entre com o terceiro número inteiro: ");
					n3 = ler.nextInt();
					
					if (n1 > n2 && n1 > n3)
						nmaior = n1;
					if (n2 > n1 && n2 > n3)
						nmaior = n2;
					if (n3 > n1 && n3 > n2)
						nmaior = n3;
					

					System.out.println("O maior número é: "+ nmaior);
					
					
				}
	}
				
	