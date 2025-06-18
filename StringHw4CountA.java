package StringDataType;

public class StringHw4CountA {

	public static void main(String[] args) {
//count how many times a character appears. for ex: "banana" , char='a', output=3
		String s1 = "banana";
		int count = 0;
		for(int i = 0;i<s1.length();i++) {
			if(s1.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("The char a in string is " + count + " times.");
		

	}

}
