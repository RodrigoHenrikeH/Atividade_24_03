package atividades_24_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1_ArrayList {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "ª Cor: ");
			cores.add(lerScanner.nextLine());
		}

		System.out.println("Todas as Cores da lista: \n");

		for (String cor : cores)
			System.out.println(cor + " ");

		cores.sort(null);

		System.out.println("\nAs cores em ordem são: \n ");

		for (String corOrdem : cores)
			System.out.println(corOrdem + " ");

		lerScanner.close();

	}

}
