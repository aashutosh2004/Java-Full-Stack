import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class csvWriter {
    public static void main(String[] args) {
        String filePath = "data.csv";

        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
            pw.println("ID,Name,Age");

            pw.println("1,Aashu,25");
            pw.println("2,Rishi,30");
            pw.println("3,Tushar,22");

            System.out.println("CSV file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
