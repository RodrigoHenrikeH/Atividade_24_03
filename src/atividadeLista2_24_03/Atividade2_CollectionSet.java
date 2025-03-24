package atividadeLista2_24_03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade2_CollectionSet {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		HashSet<Integer> setNumeros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º Numero: ");
			setNumeros.add(lerScanner.nextInt());
		}

		System.out.println("\nA lista dos dados do SET em ordem são: \n");

		Iterator<Integer> iSetNumeros = setNumeros.iterator();
		while (iSetNumeros.hasNext()) {
			System.out.println(iSetNumeros.next());
		}

		lerScanner.close();

	}
}
