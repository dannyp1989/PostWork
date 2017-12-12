package a_Zadania.a_Interfejsy_funkcyjne;

import java.util.Arrays;
import java.util.List;

public class Main1 {

	static <T> void printList(List<T> src, FilterInterface<T> f) {
		for (T s: src) {
			if (f.check(s)) {
				System.out.println(s);
			}
		}
	}
	
	public static void main(String[] arg) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,21,23,25);
		
		Main1.printList(list, new NumberFilter());
		
	}
	
}
