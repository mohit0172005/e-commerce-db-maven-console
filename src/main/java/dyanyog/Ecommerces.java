package dyanyog;

import java.util.Scanner;

public class Ecommerces {
	
public static void main (String []args) {
		
		Scanner scan = new Scanner (System.in );
		
		System.out.println("######### Welcome to E-Commerce ##########\n\n");
		
		System.out.println("******* Login :\n") ;
		
		System.out.println("\tEnter UserName : ");
		String username = scan.next();
		
		System.out.println("\tEnter Password : ");
		String password = scan.next();
		
		if (username.equals("vzodge")) {
			if(password.equals("Test@123")) {
				
				System.out.println("Login Successful");
				return ; 
			}
		}
		System.out.println("login fail");
	}


}
