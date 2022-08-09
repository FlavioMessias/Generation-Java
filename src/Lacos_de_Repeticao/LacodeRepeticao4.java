package Lacos_de_Repeticao;

	import java.util.Scanner;
	public class LacodeRepeticao4 {

		public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, soma=0, med;
		
		do {
			System.out.println("Digite um numero: ");
				x = ler.nextInt();
			soma += x;
			

		}	
		while (x != 0);
			System.out.println("A soma dos valores é de: "+ soma);
		
		
	}

}
