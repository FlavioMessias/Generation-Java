package Lacos_de_Decisao;

	import java.util.Scanner;
	public class LacosdeDecisao2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
			int num;
			double res;
			
				System.out.println("Entre com um número: ");
					num = ler.nextInt();
			
					if(num % 2 == 0) 
						res = Math.sqrt(num);
					else 
						res = Math.pow(num, 2);
			
			
					System.out.printf("O resultado é = %.2f",res);

				}

		}
