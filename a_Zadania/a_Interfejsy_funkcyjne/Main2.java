package a_Zadania.a_Interfejsy_funkcyjne;

import java.util.Arrays;
import java.util.List;

public class Main2 {

	static <T,S> void printList(List<S> src, FilterInterface<S> f, Transform<T, S> t) {
		for (S s: src) {
			if (f.check(s)) {
				System.out.println(t.transform(s));
			}
		}
	}
	
	public static void main(String[] arg) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,21,23,25);
		
		Main2.printList(list, new NumberFilter(), new NumberTransform());
		
	}
	
}
