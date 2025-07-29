package di;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();
        UserService userService = new UserService(printer);
        userService.usePrinter("My first print!---> Constructor");


        Printer printer2 = new Printer();
        UserService userService2 = new UserService(null);
        userService2.setPrinter(printer2);
        userService2.usePrinter("My second print!---> Setter");

    }
}
