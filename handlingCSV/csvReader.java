import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class csvReader {
    public static void main(String[] args) {
        String filePath = "data.csv";
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.print(value + " | ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
