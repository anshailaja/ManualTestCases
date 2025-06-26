package InterviewQuestion;

public class Skip5 {

	public static void main(String[] args) {
		int num=100;
		
		for(int i=1;i<=num;i++) {
			if(i%5==0) {
				continue;
			}
			System.out.print(i + " ");
			
		}
		
				
		
	}

}
