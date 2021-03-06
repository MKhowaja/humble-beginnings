import java.util.Scanner;
public class Sinnum {
  public static void main(String[] args) {
		int sin, sum=0, temp; //Variables created for the sin number, sum of digits and a temporary variable to store digits
		final int END=999999999; //Constant variable to store exit loop condition
		Scanner input = new Scanner(System.in); //User input
		System.out.println("Enter Social Insurance Number: ");//Prompt for sin number
		sin = input.nextInt(); //Get sin number
		while (sin!=END){ //Exit loop condition
			for (int i = sin/10; i>0; i/=100) { //Isolates even digits
				temp = 2*(i%10); //Doubles the digit
				if (temp>=10) //Checks if the product is 2 digits
					sum+= temp%10 + (temp/10)%10; //adds digits
				else //one digit
					sum+= temp; //Adds the digit to the sum
			} 
			for (int i = sin/100;i>0;i/=100) //isolates odd digits 
				sum+= i%10; //adds the digit to the total sum
			if ((10-sum%10)%10==sin%10) //Checks validity of the sin number
				System.out.println("This sin number is valid!");
			else
				System.out.println("This sin number is invalid!");
			sum = 0;//Reset sum
			System.out.println("Enter Social Insurance Number: ");//Prompt for sin number
			sin = input.nextInt();//Get sin number
		}
	}	
}
