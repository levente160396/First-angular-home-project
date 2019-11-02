package CollectionListSetInterface;

import java.util.HashSet;

public class Name {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		names.add("David");
		names.add("Bryan");
		names.add("Cynthia");
		System.out.println("The number of names is " + names.size());
		for(String name: names) {
			System.out.println(name);
		}
		names.remove("David");
		names.add("Raymond");
		String name = "David";
		if(names.contains(name)) {
			System.out.println(name + "is in the collection.");
		}else {
			System.out.println(name + " is not in the collection.");
		}
		for (String tmp : names) {
			System.out.println(tmp);
		}
		names.clear();
		System.out.println("Number of name " + names.size());
	}
}
