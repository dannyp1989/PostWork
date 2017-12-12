//package a_Zadania.a_Interfejsy_funkcyjne;
//
//import java.util.*;
//
//@FunctionalInterface
//interface Filter<V> {
//    boolean check(V v);
//}
//
//class WomanFilter implements Filter<String>{
//    @Override
//    public boolean check(String name){
//        return name.toLowerCase().charAt(name.length()-1) == 'a';
//    }
//
//}
//
//class NumberFilter2 implements Filter<Integer>{
//    @Override
//    public boolean check(Integer x){
//        return x<20;
//    }
//}
//
//public class FuncExample {
//
//    private static <T> void printList(List<T> list, Filter<T> f, String msg){
//
//        System.out.println("#### " + msg + " ####");
//
//        for(T str: list){
//            if(f.check(str)){
//                System.out.println(str);
//            }
//        }
//
//        System.out.println("#### ^^^^ ####");
//    }
//
//    private static <T> void printList(List<T> list, String msg){
//        printList(list, (T x) -> true, msg);
//    }
//
//
//
//    static <T> void printList(List<T> src, Filter<T> f) {
//        for (T s : src) {
//            if (f.check(s)) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    public static void main(String[] args){
//        List<String> names = Arrays.asList("Oliwka", "Wojtek", "Ania", "Magda", "Zosia", "ola", "ela", "ala", "ula");
//
//        List<Integer> numbers = new ArrayList<>();
//
//        Random rand = new Random();
//
//        for(int i=0; i<20; i++){
//            numbers.add(rand.nextInt(40));
//        }
//
//        Filter<Integer> lt20 = new NumberFilter2();
//        Filter<Integer> lt10 = (Integer x) -> {
//            return x<10;
//        };
//
//        printList(numbers, "liczby");
//        printList(numbers, lt20, "liczby mniejsze niż 20");
//        printList(numbers, lt10, "liczby mniejsze niż 10");
//        printList(numbers, (Integer x) -> x<15, "liczby mniejsze niż 15");
//        printList(numbers, x -> x>10, "wieksze niż 10");
//
//        WomanFilter womanFilter = new WomanFilter();
//
//        printList(names, (String str) -> true,  "lista bez sortowania");
//        printList(names, str -> str.length()<5,  "lista bez sortowania, imiona krótsze niż 5 liter");
//        printList(names, womanFilter, "imiona kończące się na a");
//
//
//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//
//        printList(names, "lista sortowana wg. wielkości liter, klasa anonimowa jako komparator");
//
//        names.sort((String s1, String s2) -> s1.compareToIgnoreCase(s2));
//
//        printList(names, "lista sortowana bez wielkości liter, wyrażenie lambda jako komparator");
////        printList(names, (String str) -> str.toLowerCase().charAt(str.length()-1) != 'a', "tylko męskie imiona");
//
//    }
//
//}
