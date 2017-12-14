package a_Zadania.c_Strumienie;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

	public static void main(String[] arg) {
	
    List<String> names = Arrays.asList("Oliwka", "Wojtek","testp" , "Ania", "Magda", "Zosia", "ola", "ela", "ala", "ula");
    List<String> fruits =
            Arrays.asList("orange", "lemon", "peach", "banana", "plum",
                    "cherry", "apple", "pomelo");
    
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
    
    
	}
}
