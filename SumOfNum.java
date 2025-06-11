package Virat;

public class SumOfNum {

	public static void main(String[] args) {
		int sum=0,num =1234,digit;
		while(num>0) {
			digit = num % 10;  
			 
			sum = sum + digit;  
			
			num = num / 10;  
			}  
			
			System.out.println("Sum of Digits: "+sum); 
			
		}
		
}



