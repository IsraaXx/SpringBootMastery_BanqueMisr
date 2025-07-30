package spring_core_demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class UserService {

    private Printer printer;

    @Autowired
    public UserService(Printer printer) {
        System.out.println("Constructor injection");
        this.printer = printer;
    }

    @Autowired
    public void SetPrinter(Printer printer) {
        System.out.println("Setter injection");
        this.printer = printer;
    }

    public void usePrint(String msg){
        printer.print(msg);
    }

}
