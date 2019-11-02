package CollectionListSetInterface;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Alpha {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("Raymond");
		names.add("Mike");
		names.add("Bryan");
		names.add("Jennifer");
		names.add("Clayton");
		names.add("Terrill");
		System.out.println("Number of names = " + names.size());
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("Name befor jennifer " + names.lower("Jennifer"));
		System.out.println("Name after jennifer: " + names.higher("Jennifer"));
		System.out.println("First element " + names.first());
		System.out.println("Last element " + names.last());
		
		Comparator<String>  stringlength = new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
			
				return s1.length() - s2.length();
			}
			
		};

		
		PriorityQueue<String> names2 = new PriorityQueue<String>(stringlength);
		names2.add("Raymond");
		names2.add("Mike");
		names2.add("Bryan");
		names2.add("Jennifer");
		names2.add("Clayton");
		names2.add("Terrill");
		  
		
		  while (!names2.isEmpty()) {
	            System.out.println(names2.remove());
	        }
	}
}
