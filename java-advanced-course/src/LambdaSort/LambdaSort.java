package LambdaSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import LambdaSort.Human.Gender;

public class LambdaSort {

	public static void main(String[] args) {
		List<Human> humans = new ArrayList<Human>();
		humans.add(new Human("Nóra", 23, Gender.FEMALE));
		humans.add(new Human("Béla", 30, Gender.MALE));
		humans.add(new Human("József", 18, Gender.MALE));
		humans.add(new Human("Kata", 30, Gender.FEMALE));
//		Collections.sort(humans, new Comparator<Human>() {
//			@Override
//			public int compare(Human h1, Human h2) {
//				return h1.getName().compareTo(h2.getName());
//			}
//		});
		
//		humans.sort((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));
//		humans.sort(Human::compareToNameThenAge);
//		Collections.sort(humans, Comparator.comparing(Human::getName).thenComparing(Human::getAge));
		
		
		
		
		humans.sort((Human h1, Human h2)-> h1.getName().compareTo(h2.getName()));
		humans.sort(Human::compareToNameThenAge);
		Collections.sort(humans, Comparator.comparing(Human::getName).thenComparing(Human::getAge));
	
		for (Human human : humans) {
			System.out.println(human.getName());
		}
	}

}
