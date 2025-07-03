class Printer {
    public static <T> void Print(T items) {
        System.out.println(items);
    }
}

public class genericsPrinter{
    public static void main(String[] args) {
        Printer.Print("abcd");
        Printer.Print(123);
        Printer.Print(3.54);
    }
}
