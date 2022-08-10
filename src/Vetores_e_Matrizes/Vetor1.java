package Vetores_e_Matrizes;

	import java.util.Scanner;
	public class Vetor1 {
	
		public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
			
			int[] A = {1, 0, 5, -2, -5, 7};
			int soma=0;
			
			soma = A[0] + A[1] + A[5];
			
			System.out.println("A soma entre os valores das posições A[0], A[1] e A[5] do vetor é: "+ soma);
			
			A[4] = 100;
			
			for(int s : A) {
				System.out.println(s);
			}

		}
}
