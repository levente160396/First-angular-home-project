package CollectionListSetInterface;

import java.util.PriorityQueue;

public class Line {
	public static void main(String[] args) {
		PriorityQueue<String> line = new PriorityQueue<String>();
		line.add("David");
		line.add("Raymond");
		line.add("Bryan");
		line.add("Clayton");
		for (String name : line) {
			System.out.println(name);
		}
		System.out.println();
		line.poll();
		for (String name : line) {
			System.out.println(name);
		}
		System.out.println();
		line.remove("Raymond");
		for (String name : line) {
			System.out.println(name );
		}
		System.out.println();
		System.out.println("The head: " + line.peek());
	}
	
	
	
}
