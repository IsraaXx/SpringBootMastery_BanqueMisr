package di;

public class UserService {

    private Printer printer;


    // Constructor injection
    public UserService(Printer printer) {
        this.printer = printer;
    }

    // setter injection
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }


    public void usePrinter(String msg){
        printer.print(msg);
    }

}
