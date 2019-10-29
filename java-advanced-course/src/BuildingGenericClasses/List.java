package BuildingGenericClasses;

public class List<T> {
	
	private T[] dataStore;
	
	private int size;
	
	private int pos;

	public List(int numElements) {
		size = numElements;
		pos = 0;
		dataStore = (T[]) new Object[size];
	}	
	
	public void add(T element) {
		dataStore[pos] = element;
		++pos;
	}
	
	public String toString() {
		String elemnts ="";
		for (int i = 0; i < pos; i++) {
			elemnts += dataStore[i] + " ";
		}
		return elemnts;
	}
}
