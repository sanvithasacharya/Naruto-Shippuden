package PRACTICE;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r;
		int a,num;
		r = new Random();
		num = r.nextInt(100);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a random number: ");
		a = userInput.nextInt();
		System.out.println("Generated number is : " + num);
		if(a == num) {
			System.out.println("User Won");
			
		}
		else {
			System.out.println("User Lost");
		}
	}

}
