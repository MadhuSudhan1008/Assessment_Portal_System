package Executor;

import java.util.Scanner;

import Services.Services;
import Users.Users;

public class Executor {
	public static void main(String[] args) {
		System.out.println("......Welcome to assessment portal System");
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to login");
		System.out.println("press 2 to register");
		int choice = sc.nextInt();
		Services s = new Services ();
		switch(choice) {
		case 1 :
			s.login();
			break;
		case 2 :
			s.register();
			break;
		
		}

	}
}

