import java.util.Scanner;

public class Assignment2CreditCard {

	public static void main(String[] args) {
		//Credit card
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Welcome to Bank Harimau, please enter any key to continue.");
		System.out.println("Please enter your name: ");
		String name = in.next();
		System.out.println("Please enter your identity card number: ");
		String ic = in.next();
		System.out.println("Please enter your state name: ");
		String state = in.next();
		
		System.out.println("Here comes the crucial question to justify whether you are qualified to apply credit card or not. ");
		System.out.println("Please enter your age: ");
		int age = in.nextInt();
		if(age>=18) {
			System.out.println("Congratulations! You are qualified to move onto the next step.");
		} else if(age<18) {
			System.out.println("Oops, seems like you are not qualified to apply credit cards.");
		}
		
		System.out.println("Here is the break section for those who want to apply credit cards. ");
		for(int i=0; i<6; i++) {
			for(int p=0; p<i; p++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("Please enter your income per annum: ");
		int income = in.nextInt();
		if(income>=24000) {
			System.out.println("Congratulations! You are qualified to apply credit cards from Bank Harimau");
		} else if(income<24000) {
			System.out.println("Oops, you have not achieved the minimum eligibility for new credit card holders.");
		}
		
		if(income>=50000) {
			System.out.println("Type of credit card(s) provided are 'Platinum Credit Card', 'Gold Credit Card' and 'Signature Credit Card'.");
		} else if(income<50000 && income>=24000) {
			System.out.println("Type of credit card(s) provided are 'Classic Credit Card' and 'Harimau Credit Card");
		}
		System.out.println();
		
		System.out.println("Our customer service will contact you to choose the type of credit card(s) you would like to apply after paying the total fees. ");
		
		System.out.println("Please wait while we try to serve you with the best service. ");
		for(int i=0; i<20; i++) {
			System.out.print("--");
		}System.out.println("");
		
		if(income>=50000) {
			System.out.println("The annual fees is RM130 and the interest rate per month is 1.30% to 1.70%.");
		} else if(income>=24000 && income<50000) {
			System.out.println("The annual fees is RM60 and the interest rate per month is 1.25% to 1.50%.");
		}
		
		if(income>=50000) {
			System.out.println("The maximum amount of credit cards you can apply is 2.");
		} else if(income>=24000 && income<50000) {
			System.out.println("The maximum amount of credit cards you can apply is 1.");
		}
		
		System.out.println("Please enter the amount of credit cards you would like to apply: ");
		int card = in.nextInt();
		System.out.println();
		
		System.out.println("Please note that we have a surcharge of RM3 for service charges. ");
		for(int i=0; i<20; i++) {
			System.out.print("--");
		} 
		System.out.println("");
		
		System.out.println("Please wait while we calculate the total fees for this one-time service. ");
		System.out.println();
		
		for(int i=0; i<20; i++) {
			System.out.print("--");
		}
		System.out.println("");
		
		int sum2 = card*60*3;
		if(income>=24000 && income<50000) {
			System.out.println("The total fees that you have to pay is " + "RM" + sum2);
		} else if(income>=50000) {
			int sum1 = card*130*3;
			System.out.println("The total fees that you have to pay is " + "RM" + sum1);
		}
		
		System.out.print("Please wait while we connect to our payment system. ");
		System.out.println();
		
		for(int i=0; i<20; i++) {
			System.out.print("---");
		}
		System.out.println("");
		
		System.out.println("Please move on to pay the total fees. ");
		System.out.println();
		System.out.println("We will inform you when the credit card(s) is ready by the number of 03-1234567. ");
		System.out.println("Thank you for using Bank Harimau. Please come again, thank you. ");
		
		for(int i=0; i<6; i++) {
			for(int p=5; p>i; p--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}
	}
