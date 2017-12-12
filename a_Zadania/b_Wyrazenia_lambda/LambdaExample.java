package a_Zadania.b_Wyrazenia_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile będzie słów, śmiertelniku?");
        while(!scan.hasNextInt()){
            scan.next();
            System.out.println("Podaj liczbę nędzny białkowcu!");
        }
        int len = scan.nextInt();
        List<String> lista = new ArrayList<>();
        for(int i=0; i<len; i++){
            lista.add(getNext(str -> str.length()>3, "Niechaj twe słowo będzie dłuższe nędzniku!!!"));
        }

        lista.sort((String s1, String s2) -> s1.compareToIgnoreCase(s2));

        lista.forEach(System.out::println);
    }

    public static String getNext(Predicate<String> p, String msg){
        Scanner scanner = new Scanner(System.in);
        String token = scanner.next();
        if(p.test(token)){
            return token;
        }
        System.out.println(msg);
        return getNext(p, msg);
    }
}
