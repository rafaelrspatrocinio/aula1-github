package app;

import java.util.Scanner;

import entities.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setFala(sc.next());
		System.out.println(pessoa.getFala());
		
		sc.close();
	}

}
