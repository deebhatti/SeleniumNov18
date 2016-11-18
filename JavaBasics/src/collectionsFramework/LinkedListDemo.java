package collectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("Chennai");
		cities.add("London");
		cities.add("New Delhi");
		cities.add("Paris");

//		for (String t : cities) {
//			System.out.println(t);
//		}
		
		Iterator<String> itr = cities.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		int number = cities.size();

		System.out.println("Total number of values = " + number);
	}

}
