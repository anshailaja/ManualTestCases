package StringDataType;

import java.util.Scanner;

public class StringHw6Scanner {

	public static void main(String[] args) {
/*Use the Scanner class and 
		3.1 Read int, float, double, boolean, String values
		3.2 Store values in different variables
		3.3 Print these variables
		3.4 Do some arithmetic operations
		3.5 Look for the errors*/
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1 + num2;
		System.out.println("Enter the num1: " + num1);
		System.out.println("Enter the num2: " + num2);
		System.out.println("The addition is : " + num3);
		
		float num4 = sc.nextFloat();
    	float num5 = sc.nextFloat();
		float num6 = num4 * num5;
		float num7 = num1 * num4;
		System.out.println("Enter the num4: " + num4);
		System.out.println("Enter the num5: " + num5);
		System.out.println("The Multiplication is : " + num6);
		System.out.println("The Multiplication is : " + num7);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = s1 + s2;
		System.out.println("Enter the s1: " + s1);
		System.out.println("Enter the s2: " + s2);
		System.out.println("The Addition is : " + s3);
		
		boolean b1 = sc.nextBoolean();
		boolean b2 = sc.nextBoolean();
		boolean b3 = b1 && b2;
		boolean b4 = b1 || b2;
		boolean b5 = !(b1&&b2);
		System.out.println("The answer of the above operation is " + b3);
		System.out.println("The answer of the above operation is " + b4);
		System.out.println("The answer of the above operation is " + b5);
		
	}

}
