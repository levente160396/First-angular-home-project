package BuildingGenericClasses;
public class ListDriver {
	public static void main(String [] args) {
		List<String> gList = new List<String>(10);
		gList.add("milk");
		gList.add("eggs");
		System.out.println("Grocery list: " + gList.toString());
		
		List<Integer> number = new List<Integer>(5);
		number.add(1);
		number.add(2);
		number.add(3);
		System.out.println("Numbers: " + number.toString());
	}

}
