package Lacos_de_Repeticao;

	import java.util.Scanner;
	public class LacodeRepeticao3 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
			
		int num, menor=0, maior=0, x=1;
			
			System.out.println("\nEntre com um número: ");
			num = ler.nextInt();
			
			while(num!=-99) {
				
				if (num < 21) {
					menor += x;
				}
				else if (num > 50) {
					maior += x;
				}
			
				System.out.println("\nEntre com um número: ");
				num = ler.nextInt();
			}
			
			System.out.printf("\nA quantidade de pessoas com menos de 21 anos é de: "+ menor);
			System.out.printf("\nA quantidade de pessoas com mais de 50 anos é de: "+ maior);
			

		
	}
	
	}
