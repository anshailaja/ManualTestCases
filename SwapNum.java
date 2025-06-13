package Virat;
//Swap values of two variables without direct reassignment and without creating any extra variables.

public class SwapNum {

	public static void main(String[] args) {
		int a=12;
		int b=13;
		System.out.println("Before swapping the value of a is: " + a);
		System.out.println("Before swapping the value of a is: " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping the value of a is: " + a);
		System.out.println("After swapping the value of a is: " + b);
		
		
	}

}
