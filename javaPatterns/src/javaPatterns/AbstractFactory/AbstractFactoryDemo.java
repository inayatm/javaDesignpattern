package javaPatterns.AbstractFactory;

import java.util.Scanner;

public class AbstractFactoryDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press Enter to continue,else press q to exit:");
		String input=sc.next();
		   System.out.println(input);
		while(!input.equalsIgnoreCase("q")) {
			System.out.println("Would like to continue with credit card eligible search?");
			if(sc.next().equalsIgnoreCase("no")) {
				System.out.println("Byeee...:)");
					break;
			}
			System.out.println("Enter credit score:");
		    int creditScore=sc.nextInt();
		    StringBuilder builder=new StringBuilder("Your eligable for below two cards.");
		    builder.append("\n");
		    builder.append("1.GOLD");
		    builder.append("2.PLATINUM");
		    builder.append("\n");
		    builder.append("Choose number for respective card:");
		    System.out.println(builder);
		    CardType cardtype= (sc.nextInt()==1?CardType.GOLD:CardType.PLATINUM);

		    
			CreditCardFactory credifactory=CreditCardFactory.getCreditCardFactory(creditScore);
			CreditCard creditCard=credifactory.getCreditCard(cardtype);
			System.out.println(creditCard);
		}
		
	}
 
}
