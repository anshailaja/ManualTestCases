package StringDataType;

public class StringHw3Pallindrome {

	public static void main(String[] args) {
/*Check if a string is Pallindrome
for ex - Input: "madam" output:true*/
		String s1 = "madam";
		String rev = "";
		for(int i=s1.length()-1;i>=0;i--) {
			rev = rev + s1.charAt(i); 
	
		}
		System.out.println(rev);
		if(s1.equals(rev)){
			System.out.println("The String is pallindrome");
			}else {
				System.out.println("The string is not pallindrome");
			}
		

	}

}
