package Virat;

public class Hw09 {

	public static void main(String[] args) {
/*print numbers from 1 to 100 without multiple of 5
		int i;
		int count=0;
		for(i=0;i<100;i++) {
			if(i%5==0) {
				count++;
				continue;
			}
		System.out.println(i);
		
		}
		System.out.println("The multiple of 5 without including is "+count);*/
		
		int num=4567, count=0;
		
		while(num!=0) {
			num/=10;
			count++;
			
			
		}
		System.out.println(num);
		
		
		

	}
}




