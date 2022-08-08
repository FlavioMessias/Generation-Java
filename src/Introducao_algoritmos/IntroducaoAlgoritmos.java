package Introducao_algoritmos;

import java.util.Scanner;
	public class IntroducaoAlgoritmos {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int anos, meses, dias, diastotais;
		
			System.out.println("Entre com quantos anos de vida você possui: ");
				anos = ler.nextInt();
			System.out.println("E quantos meses até o momento: ");
				meses = ler.nextInt ();
			System.out.println("E quantos dias você possui até a data de hoje: ");
				dias = ler.nextInt();
				
			diastotais = (anos*365) + (meses*30) + dias;
			
			System.out.println("Parabéns você possui um total de: "+ diastotais + " dias até a data de hoje!!!");
}

}
