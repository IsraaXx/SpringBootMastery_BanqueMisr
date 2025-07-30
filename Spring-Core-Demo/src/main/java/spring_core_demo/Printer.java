package spring_core_demo;
import org.springframework.stereotype.Component;

@Component
public class Printer {
    public void print(String msg) {
        System.out.println("Printing " + msg);
    }
}
