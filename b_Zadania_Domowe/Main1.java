package b_Zadania_Domowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main1 {

	public static <V> boolean checkValue(V value, FilterCheck<V> f) {
		if ( f.check(value)) {
			return true;
		}
		return false;
	}


	static <T> void filterList(List<T> list, Predicate<T> f){
		for(T s: list) {
			if ( f.test(s) ) {
				System.out.println(s);
			}else {
				System.out.println("wrong: " + s);
			}

		}
	}

	static <T, R> T cutString(T t, Function<T, T> r) {
		return r.apply(t);
	}


	static <T> List<T> search(Collection<T> collection, Predicate<T> predicate){
		List<T> list2 = new ArrayList<>();
		for ( T t : collection) {
			if (predicate.test(t)) {
				list2.add(t);
			}
		}
		return list2;
	}

	static <S, T> List<T> changeCollection(Collection<S> collection, Function<S, T> function){
		List<T> list2 = new ArrayList<>();
		for (S t: collection) {
			list2.add(function.apply(t));
		}
		return list2;
	}

	static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer) {
		
	}



	public static void main(String[] arg) {

		List<Integer> values = Arrays.asList(1,99,100,101, -213);

		values.stream()
		.filter(src -> Main1.checkValue(src, sr -> {
			if ( sr < 101 && sr >= 0) {
				return true;
			}
			return false;
		}))
		.forEach(System.out::println);


		List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");

		Main1.filterList(list, src -> src.length()>4);
		Main1.filterList(list, src -> src.indexOf('b') != -1);
		Main1.filterList(list, src -> src.endsWith("a"));

		System.out.println("==Longer than 4==");
		list.stream()
		.filter(src -> src.length()>4)
		.forEach(System.out::println);

		System.out.println("==Contain letter 'b'==");
		list.stream()
		.filter(src -> src.indexOf('b') != -1)
		.forEach(System.out::println);

		System.out.println("==End with 'a'==");
		list.stream()
		.filter(src -> src.endsWith("a"))
		.forEach(System.out::println);

		String sample = "CODERSLAB";
		int cutNumber = 2;
		System.out.println(sample + " cut by " + cutNumber + " elems is: " + 
				Main1.cutString(sample, str -> str.substring(cutNumber, str.length()-cutNumber).toLowerCase()));


		
		System.out.println("===========search=============");
		
		System.out.println(Main1.search(list, src -> src.length()>4));
		
		list.stream()
		.filter(src -> src.length()>4)
		.forEach(System.out::println);
		
		System.out.println("===========changeCollection=============");
		
		System.out.println(Main1.changeCollection(list, src -> src + " - dodatek"));
		
		list.stream()
		.map(src -> src + " - dodatek")
		.forEach(System.out::println);
		
		System.out.println("===========consumeCollection=============");
		
		

	}
	


}



