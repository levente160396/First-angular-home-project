package BuildingGenericClasses;

public class PairProg {

	public static void main(String[] args) {
		Pair<String, Integer> gradel = new Pair<String, Integer>("Williams", 9);
		Pair<String, Integer>  grade2 = new Pair<String, Integer>("Brown", 44);
		
		System.out.println(gradel.first());
		System.out.println(gradel.second());
		System.out.println(grade2.first());
		System.out.println(grade2.second());

	}

}
