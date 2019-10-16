package com.exercise10_1subprogramms.app;
import java.util.Scanner;
public class Subprogramms {
	public static void main(String[] args) {
		//Variables declaration
		int number1 = 0;
		int number2 = 0;
		int result = 0;
		//Creation objects
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(ShowTunnedMessage("Dany"));
		ShowMessage();
		number1 = scan.nextInt();		
		ShowMessage();
		number2 = scan.nextInt();
		
		result = AddNumbers(number1,number2);
		System.out.println("The result of your number is: "+result);
		scan.close();
	}
	
	//Method to ask a number
	public static void ShowMessage() {
		System.out.print("Input a number: ");
	}
	//Method to show tuned message
	public static String ShowTunnedMessage(String message) {
		return "Hola "+message;
	}
	
	//Method to add numbers
	public static int AddNumbers(int num1, int num2) {
		return num1+num2;
	}
}
