package HomeWork;
import java.util.*;
public class QueueLinkedListHw{
	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<>();
		q1.add("Code with harry");
		q1.add("Neso Academy");
		q1.add("SDET-QA");
		
		for(String s : q1 ) {
			System.out.println(s);
		}
		
		String s1 = q1.peek();
		System.out.println(s1);
		
		String s2 = q1.poll();
		System.out.println(s2);
		
		boolean b1 = q1.offer(s2);
		System.out.println(b1);
		
		
		
		
		
		
	}
	
}