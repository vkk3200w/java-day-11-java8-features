
import java.util.Optional;

public class  NullPointerException{
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Kishore");

        System.out.println("Name: " + name.get());

        Optional<String> emptyName = Optional.empty();

        System.out.println("Is name present? " + emptyName.isPresent());

        String result = emptyName.orElse("Default Name");

        System.out.println("Result: " + result);

        Optional<String> nullableName = Optional.ofNullable(null);

        nullableName.ifPresent(value ->
            System.out.println("Name: " + value)
        );
    }
}
