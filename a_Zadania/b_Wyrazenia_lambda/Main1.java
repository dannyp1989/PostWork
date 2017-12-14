package a_Zadania.b_Wyrazenia_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main1 {

	static List<String> getList() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a number of words");
		while(!scan.hasNextInt()) {
			System.out.println("It must be integer number");
			scan.next();
		}
		int limit = scan.nextInt();
		List<String> scanList = new ArrayList<>();
		for (int i = 0 ; i < limit ; i++) {
//			scanList.add(Main1.getString(src -> src.length()>3, "Add text longer than 3!"));
			scanList.add(Main1.getInteger(src -> src.matches("[0-9]+"), "Add integer"));
		}
		scanList.sort((String src1, String src2)-> src1.compareToIgnoreCase(src2));
		scanList.forEach(System.out::println);
		
		return scanList;
	}
	
	public static String getString(Predicate<String> p, String msg) {
		Scanner scanner = new Scanner(System.in);
        String elem = scanner.next();
        if (p.test(elem)) {
        	return elem;
        }
        System.out.println(msg);
        return getString(p, msg);
	}
	public static String getInteger(Predicate<String> p, String msg) {
		Scanner scanner = new Scanner(System.in);
		String elem = scanner.next();
		if (p.test(elem)) {
			return elem;
		}
		System.out.println(msg);
		return getInteger(p, msg);
	}
	
	public static Double getSquare(MathInt<Double> p, Double a) {
		return p.math(a);
	}
	public static Double getFactorial(MathInt<Integer> p, Integer a) {
		return p.math(a);
	}
	

    public static Double factorial(int N)
    {
        Double multi = 1D;
        for (int i = 1; i <= N; i++) {
            multi = multi * i;
        }
        return multi;
    }
	
	public static void main (String[] arg) {
//		Main1.getList();
		
		System.out.println("Power of 2.13 is : " + Main1.getSquare(src -> (src * 2), 2.13));
		System.out.println("Square of 2.13 is : " + Main1.getSquare(src -> (Math.sqrt(src)), 2.13));
		System.out.println("Factorial of 5 is : " + Main1.getFactorial(src -> (factorial(src)), 5));
	
	}
	
	
	
	
	
	
	
}
