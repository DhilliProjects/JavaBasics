package collections.practice;

import java.util.*;

public class CollectionPractice {

	public static void main(String args[])

{

		Queue<Integer> ad = new PriorityQueue<Integer>();
		ad.offer(18);
		ad.add(5);
		//ad.pop();
		ad.add(14);
		//ad.push(8); //replacing
		//ad.push(10);
		//ad.clear();
		//ad.clear();
		System.out.println(ad.poll());
		System.out.println(ad);
		
		
}
}
