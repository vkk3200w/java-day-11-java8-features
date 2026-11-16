
interface Greeting {
    void sayHello();
}

public class LambdaExpressions {
    public static void main(String[] args) {

        Greeting greeting = () -> System.out.println("Hello, welcome to Java!");

        greeting.sayHello();

        Runnable task = () -> System.out.println("Task is running");

        task.run();
    }
}
