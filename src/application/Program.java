package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdraw = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdraw);
		try {
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println();
			System.out.println(account);
		
		}catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		
		

	}

}
