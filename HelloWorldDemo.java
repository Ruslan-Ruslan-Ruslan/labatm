import java.time.LocalDate;

public class HelloWorldDemo {
    public static void main(String[] argv) {
        System.out.println("Hello world");
        System.out.println("This task done by Lashko Ruslan, group PZ-21-1/9");
        
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
    }
}
