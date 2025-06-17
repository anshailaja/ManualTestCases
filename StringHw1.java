package StringDataType;

public class StringHw1 {

	public static void main(String[] args) {
		/*Write a Java Program to Calculate total number of vowels in a String 
		“Hello how are you doing today?”*/
		String s1 = "Hello how are you doing today?";
		//s1=s1.toLowerCase();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if (s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' ||
					s1.charAt(i)=='o' || s1.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("The vowels in a given string is " + count);
		 
		

	}

}
