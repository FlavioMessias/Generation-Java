package Vetores_e_Matrizes;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);		
	
			int [][] num = new int[3][3];
			int x, y, contNum=0;
			
			
			for(x=0;x<3;x++) {
				for(y=0;y<3;y++) {
					
					System.out.println("\nEntre com um número: ");
						num[x][y] = ler.nextInt();
				if (num[x][y] > 10) {
					contNum++;
									}
								}
							}
				{
				System.out.println("A quantidade de números maiores que 10 é de: "+ contNum);
				}
		}	
}

	
