package a_Zadania.c_Strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Oliwka", "Wojtek", "Ania", "Magda", "Zosia", "ola", "ela", "ala", "ula");
        List<String> fruits =
                Arrays.asList("orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo");

        fruits.stream()
                .filter(s -> s.startsWith("p"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        names.stream()
                .filter(s -> s.endsWith("a"))
                .map(str -> str.length())
                .sorted()
                .forEach(System.out::println);

        Random rand = new Random();

        List<Employee> corpoSlaves = names.stream()
                .map(
                        name -> new Employee(
                                name,
                                name.endsWith("a")?"k":"m",
                                (rand.nextDouble()*4400)+2100)
                )
                .collect(Collectors.toList());

        corpoSlaves.forEach(System.out::println);

        System.out.println("\n\n");

        corpoSlaves.stream()
                .filter(
                        slave -> slave.getName().toLowerCase().startsWith("o"))
                .forEach(System.out::println);

        System.out.println("\n\n");

        corpoSlaves.stream()
                .filter(slave -> slave.getSalary()>4400)
                .forEach(System.out::println);
    }
}
