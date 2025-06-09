package Virat;

public class Conditional {

	public static void main(String[] args) {
		int math,sci,eng;
		float avg = 0;
		String grade = null;
		math=45;
		sci=56;
		eng=78;
		if(math<35 || sci<35 || eng<35 ) {
			System.out.println("Failed due to low score in at least one subject.");
		}else {
			avg=(math+sci+eng)/3;
			System.out.println("The average of 3 subject is: " + avg);
		} 
		
		if (avg>=90) {
			System.out.println(grade= "A+");
		}
		else if(avg>=75 && avg<=89) {
			System.out.println(grade= "A");
		}
		else if(avg>=60 && avg<=74) {
			System.out.println(grade= "B");
		}
		else if(avg>=40 && avg<=59) {
			System.out.println(grade= "C");
		}
		else if(avg<40) {
			System.out.println(grade= "Fail");
		}
		System.out.println("Grade: " + grade);
		switch(grade) {
		case "A+":
		case "A":
			System.out.println("Excellent performance!");
			break;
		case "Fail":
			System.out.println("Please work harder next time.");
			break;
		default:
			System.out.println("Keep improving.");
			break;
		}
			
			
			
			
		}
	
		

	}


