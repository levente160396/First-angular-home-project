package ClassicDataStructures;

import java.util.Stack;

public class Convert {
	
	static String binary(int number) {
		final int base = 2;
		Stack digits = new Stack();
		do {
			digits.push(number % base);
			number /= base;
		}while(number != 0);
		String bits = "";
		while(!digits.empty()) {
			bits += digits.peek();
			digits.pop();
		}
		return bits;
	}
	public static void main(String[] args) {
		int num = 1000; //101
		System.out.println(num + "in binary is " + binary(num));
	}
}
