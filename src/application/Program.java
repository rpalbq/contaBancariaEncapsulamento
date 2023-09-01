package application;

import java.util.Scanner;

import entitie.Banco;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------- BANCO DO AMOR ---------------------");
		System.out.print("Enter account number:");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder:");
		String nomeTitular = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?");
		String resposta = sc.next();
		Banco usuario = null;
		
		if (resposta.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value:");
			double deposito =  sc.nextDouble();
			usuario = new Banco(numeroConta, nomeTitular, deposito);
		} else {
			usuario = new Banco(numeroConta, nomeTitular);
		}
		
		System.out.println(usuario);
		
		System.out.println("Enter a deposit value:");
		double quantidade = sc.nextDouble();
		usuario.deposito(quantidade);
		
		System.out.println(usuario);
		
		System.out.println("Enter a withdraw value:");
		quantidade = sc.nextDouble();
		usuario.saque(quantidade);
		
		System.out.println(usuario);
		
		sc.close();
	}

}
