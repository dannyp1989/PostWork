package a_Zadania.a_Interfejsy_funkcyjne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

	static <T,S> List<T> create (List<S> src, FilterInterface<S> f, Transform<T, S> t) {
		List<T> list = new ArrayList<>();
		for (S s: src) {
			if ( f.check(s)) {
				list.add(t.transform(s));
			}
		}
		System.out.println(list.toString());
		return list;
	}
	
	public static void main(String[] arg) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,21,23,25);
		
		List<Integer> listTransformed = new ArrayList<>();
		
		listTransformed = Main3.create(list, new NumberFilter(), new NumberTransform());
		
		System.out.println(listTransformed.toString());
		
	}
	
}
