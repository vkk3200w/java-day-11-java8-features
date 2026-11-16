
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 15, 20, 25, 30, 35, 40
        );

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        List<Integer> doubledNumbers = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        System.out.println("Doubled Numbers: " + doubledNumbers);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted Numbers: " + sortedNumbers);

        long count = numbers.stream()
                .filter(number -> number > 20)
                .count();

        System.out.println("Numbers greater than 20: " + count);
    }
}
