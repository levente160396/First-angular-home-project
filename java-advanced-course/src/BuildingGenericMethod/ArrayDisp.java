package BuildingGenericMethod;

public class ArrayDisp {

	static <T> void Display(T[] arr) {
		for(int i = 0; i< arr.length; ++i) {
			if(arr[i] != null) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = new String[10];
		names[0] = "David";
		names[1] = "Cynthia";
		names[2] = "Raymond";
		names[3] = "Jennifer";
		names[4] = "Bryen";
		names[5] = "Clayton";
		names[6] = "Terril";
		names[7] = "Danny";
		Display(names);
		
		System.out.println();
		
		Integer[] numbers = new Integer[3];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		Display(numbers);

	}

}
