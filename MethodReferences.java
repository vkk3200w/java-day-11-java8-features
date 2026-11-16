
import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "Kishore", "Arun", "Rahul", "Priya"
        );

        System.out.println("Using Lambda:");
        names.forEach(name -> System.out.println(name));

        System.out.println("Using Method Reference:");
        names.forEach(System.out::println);
    }
}
