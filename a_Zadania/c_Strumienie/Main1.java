package a_Zadania.c_Strumienie;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

	public static void main(String[] arg) {

		List<String> names = Arrays.asList("Oliwka", "Wojtek","testp" , "Ania", "Magda", "Zosia", "ola", "ela", "ala", "ula");

		System.out.println("=========");
		System.out.println("====Names end with 'a', sorted, to upper case and printed====");
		names.stream()
		.filter(src -> src.endsWith("a"))
		.sorted()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		System.out.println("=========");

		System.out.println("=========");
		System.out.println("====List for word length 5====");
		List<String> list = names.stream()
				.filter(src -> src.length()==5)
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(list.toString());
		System.out.println("=========");


		System.out.println("=========");
		System.out.println("====String from all listed Strings > 2 , cut to 3 chars====");

		String strinSummary = names.stream()
				.filter(src -> src.length()>2)
				.sorted()
				.map(src -> src.subSequence(0, 3))
				.collect(Collectors.joining(", "));
		System.out.println(strinSummary);
		System.out.println("=========");


		List<Employee2> employeeList= names.stream()
				.map(src -> new Employee2(
						src, 
						src.endsWith("a")?'k':'m')
						)
				.collect(Collectors.toList());

		System.out.println("=========");
		System.out.println("====All employee starts with \"A\"====");

		employeeList.stream()
		.filter(src -> src.getName().toUpperCase().startsWith("A"))
		.sorted((src1, src2) -> src1.getName().compareTo(src2.getName()))
		.forEach(System.out::println);
		System.out.println("=========");



		System.out.println("=========");
		employeeList.stream()
		.forEach(System.out::println);
		System.out.println("====Employee between 30 and 45 years old====");

		employeeList.stream()
		.filter(src -> src.getAge()>30)
		.filter(src -> src.getAge()<45)
		.forEach(System.out::println);

		System.out.println("=========");




		System.out.println("=========");
		System.out.println("====Women between 20 and 35 years old, slary greater than 3500 - 5% raise====");

		employeeList.stream()
		.filter(src -> {
			if ( src.getSex() == 'k' && src.getAge()<35 && src.getAge()>20 && src.getSalary()>3500) {
				return true;
			}
			return  false;
		})
		.map(src -> {src.setSalary(src.getSalary()*1.05); return src;})
		.forEach(System.out::println);


		System.out.println("=========");

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("=========");
		System.out.println("====Numebrs: square pow - 5 < 20");

		numbers.stream()
		.filter(src -> Math.pow(src, 2) - 5 < 20)
		.forEach(System.out::println);
		
		System.out.println("=========");

        List<String> fruits =
                Arrays.asList("orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo");

		System.out.println("=========");
		System.out.println("====Length of elements, sorted, with letter c, sum of lengths , sort and 3 first====");
		System.out.println("Lenght!!!!!!!!!!!!!!!!!!!!!!");
		fruits.stream()
		.map(src -> src.length())
		.forEach(System.out::println);
		System.out.println("Sorted!!!!!!!!!!!!!!!!!!!!!!");
		fruits = fruits.stream()
		.sorted()
		.collect(Collectors.toList());
		
		fruits.forEach(System.out::println);
		
		System.out.println("Contain 'c'!!!!!!!!!!!!!!!!!!!!!!");
		fruits.stream()
		.filter(src -> src.indexOf('c') != -1)
		.forEach(System.out::println);
		
		System.out.println("Sum of strings length's !!!!!!!!!!!!!!!!!!!!!!");
		
		long length = fruits.stream()
				.count();
		System.out.println(length);
		
		System.out.println("First 3 !!!!!!!!!!!!!!!!!!!!!!");
		int elems = 3;
		fruits.stream()
		.limit(elems)
		.forEach(System.out::println);
		
		
		System.out.println("=========");



	}
}
