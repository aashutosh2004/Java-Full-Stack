import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}
public class StudentRecordCSV{
    int studentId;
    String studentName;
    int grade;
    public StudentRecordCSV(int studentId, String studentName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
}
class CsvProcessor {
    public static void main(String[] args) {
        String filePath= "data.csv";
        List<StudentRecordCSV> validRecords = new ArrayList<>();;
        int invalidRecordCount = 0;
        int totalRecords = 0;
        try ( BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line = null;
            reader.readLine();
            while((line=reader.readLine()) != null){
                totalRecords++;
                String[] parts = line.split(",");
                try{
                    if(parts.length != 3){
                        throw new IllegalArgumentException("Incorrect number of columns in fields");
                    }
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    int grade = Integer.parseInt(parts[2].trim());
                    if (id <= 0) {
                        throw new IllegalArgumentException("Student ID must be positive");
                    }

                    if (grade < 0 || grade > 100) {
                        throw new InvalidGradeException("Grade must be between 0 and 100");
                    }

                    // If all checks pass, add to valid records
                    validRecords.add(new StudentRecordCSV(id, name, grade));

                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format in line: " + line);
                    invalidRecordCount++;
                } catch (IllegalArgumentException | InvalidGradeException e) {
                    System.err.println("Validation failed for line: " + line + " | " + e.getMessage());
                    invalidRecordCount++;
                }
            }

            // Calculate average grade
            int sum = 0;
            for (StudentRecordCSV s : validRecords) {
                sum += s.grade;
            }

            double average = validRecords.size() > 0 ? (double) sum / validRecords.size() : 0;

            // Print each valid record
            for (StudentRecordCSV s : validRecords) {
                System.out.println("Student ID: " + s.studentId + ", Name: " + s.studentName + ", Grade: " + s.grade);
            }

            // Print Summary
            System.out.println("\n--- Summary ---");
            System.out.println("Total records processed: " + totalRecords);
            System.out.println("Valid records: " + validRecords.size());
            System.out.println("Invalid records: " + invalidRecordCount);
            System.out.printf("Average grade: %.2f\n", average);

        } catch (FileNotFoundException e) {
            System.err.println("grades.csv file not found.");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
