package HomeWork;

import java.util.*;


public class DequeueLinkedListHW {

	public static void main(String[] args) {
		Deque<String> q1 = new LinkedList<>();
		q1.addFirst("Gayakwad");
		q1.addFirst("Dilip");
		q1.addFirst("Shailaja");
		q1.addLast("Premi");
		
		for(String s : q1) {
			System.out.println(s);
		}
		
		String s1 = q1.getLast();
		System.out.println(s1);
		
		String s2 = q1.removeFirst();
		System.out.println(s2);
		
		String s3 = q1.removeLast();
		System.out.println(s3);
		

	}

}
