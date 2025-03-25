package extras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AtividadeExtra {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		int numeros, posicao = 0;

		ArrayList<Integer> vetNumeros = new ArrayList<Integer>();

		vetNumeros.add(2);
		vetNumeros.add(5);
		vetNumeros.add(1);
		vetNumeros.add(3);
		vetNumeros.add(4);
		vetNumeros.add(9);
		vetNumeros.add(7);
		vetNumeros.add(8);
		vetNumeros.add(10);
		vetNumeros.add(6);

		System.out.println("Digite o numero que você deseja encontrar: ");
		numeros = lerScanner.nextInt();

		

			if (vetNumeros.contains(numeros) && numeros < 10) {
				posicao = vetNumeros.lastIndexOf(numeros);
				System.out.println("O número " + numeros + " está localizado na posição: " + posicao);
			}
				
			 if (numeros > 10)
					System.out.println("O número " + numeros + " não foi encontrado!");
					
		
	}
}
