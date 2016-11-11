package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Account account = new Account();
		int menu = 0;
		do {
			System.out.println("----------- Menu ---------");
			System.out.println("1.- Add Balance..");
			System.out.println("2.- Extract Balance..");
			System.out.println("3.- Salir");
			menu = in.nextInt();
			switch (menu) {
			
				case 1:
						System.out.println("Enter Balance, please");
						try {
							account.add(in.nextDouble());
						} catch (AccountException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					break;
					
				case 2:
//						System.out.println("Extracting, please wait");
						try {
							System.out.println("Enter an amount");
							System.out.println(account.extract(in.nextDouble()));
						} catch (AccountException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					break;

				default:
					break;
					
			}
		} while (menu != 3);
		
				System.out.println("ended application ------>");
	}

}


class Account{
	
	private double balance; 

	private double getBalance() {
		return balance;
	}

	private void setBalance(double balance) throws AccountException {
		if(balance <= 0){
			throw new AccountException("Enter a correct balance");
		}
		this.balance += balance;
	}
	
	void add(double balance) throws AccountException{
		setBalance(balance);
	}
	
	double extract(double balance) throws AccountException{
		if(this.balance <= 0){
			throw new AccountException("Without balance");
		}else if(balance <= this.balance){
			this.balance -= balance;
		}else if(balance > this.balance){
			throw new AccountException("the amount is major of your balance");
		}
		return getBalance();
	}
	
}

class AccountException extends Exception{
	public AccountException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}