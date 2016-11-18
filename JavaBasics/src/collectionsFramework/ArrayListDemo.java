package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("Chennai");
		cities.add("London");
		cities.add("New Delhi");
		cities.add("Paris");

		for (String t : cities) {
			System.out.println(t);
		}

		int number = cities.size();

		System.out.println("Total number of values = " + number);

	}

}
