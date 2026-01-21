
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static int add(int a, int b) {
        return a + b;
    }
    SpringApplication.run(App.class, args);
}
