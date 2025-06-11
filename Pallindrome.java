package Virat;

public class Pallindrome {

	public static void main(String[] args) {
		int num=123,rev=0,temp=num,rem;
		while(temp>0) {
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
			
			
		}
		if (num==rev) {
			System.out.println("Number is pallindrome");
		}
			else {
				System.out.println("Number is not pallindrome");
			}
				
			
		}
		

	}


