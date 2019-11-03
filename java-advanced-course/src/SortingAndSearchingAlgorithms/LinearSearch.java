package SortingAndSearchingAlgorithms;

public class LinearSearch {
	
	public static int lSearch(int[] arr,int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static int min(int[] arr) {
		int minumum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < minumum) {
				minumum = arr[i];
			}
		}
		return minumum;
	}
	
	public static void main(String[] args) {
		int [] data = new int[] {5,10,1,9,4,8,3,6,2,7};
		
		System.out.println("The minimum value is: " + min(data));
	}

}
