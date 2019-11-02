package CollectionListSetInterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;

public class SquareDance {
	public static void main(String[] args) {
		PriorityQueue<String> men = new PriorityQueue<String>();
		PriorityQueue<String> women = new PriorityQueue<String>();
		String line = null;
		String file = "C:\\_GIT\\gyakorlas\\dance.txt";
		String sex = "";
		BufferedReader input;
		try {
			input = new BufferedReader(new FileReader(file));
			while ((line = input.readLine()) != null) {
				sex = line.substring(0,1);
				if(sex.equals("M")) {
					men.add(line.substring(2));
				}else {
					women.add(line.substring(2));
				}
			}
			input.close();
		}catch (Exception e) {
			System.out.println( "Error opening file " + e.toString());
		}
		while(!men.isEmpty() && !women.isEmpty()) {
			System.out.println("The dance partners will be : ");
			System.out.println(men.poll() + " and " + women.poll() );
		}
		if(men.isEmpty()) {
			System.out.println("There are " + women.size() + " women waiting to dance!");
			System.out.println(women.peek() + " is the next women dancer.");
		}
		if(women.isEmpty()) {
			System.out.println("There are " + men.size() + " men waiting to dance!");
			System.out.println(men.peek() + " is the next men dancer.");
		}
	}
}
