import java.util.HashMap;

public class mapHash2 {
    public static void main(String[] args) {
        HashMap<String, Integer> marksMap = new HashMap<>();
        marksMap.put("Aashu", 45);
        marksMap.put("Rishi", 43);
        marksMap.put("Tushar", 42);

        System.out.println("Adding new students with random grades:");
        marksMap.put("Neha", 40);
        marksMap.put("Suman", 30);
        marksMap.put("Chhavi",45);

        for (String name : marksMap.keySet()) {
            System.out.println("Student " + name + ", Score: " + marksMap.get(name));
        }

        System.out.println("\nUpdating Rishi's grade...");
        if (marksMap.containsKey("Rishi")) {
            int newGrade = 44;
            marksMap.put("Rishi", newGrade);
            System.out.println("Updated Rishi's grade to: " + newGrade);
        }

        System.out.println("\nChecking if 'Tushar' is present and displaying grade:");
        boolean isPresent = marksMap.containsKey("Tushar");
        System.out.println("Is 'Tushar' present? " + isPresent);
        if (isPresent) {
            System.out.println("Tushar's marks: " + marksMap.get("Tushar"));
        }

        System.out.println("\nRemoving student Suman...");
        if (marksMap.containsKey("Suman")) {
            marksMap.remove("Suman");
            System.out.println("Suman has been removed.");
        }

        System.out.println("\nAll students and their grades:");
        for (String name : marksMap.keySet()) {
            System.out.println("Student " + name + ", Score: " + marksMap.get(name));
        }

        System.out.println("\nCalculating average grade...");
        if (!marksMap.isEmpty()) {
            int total = 0;
            for (int marks : marksMap.values()) {
                total += marks;
            }
            double average = (double) total / marksMap.size();
            System.out.printf("Average grade: %.2f\n", average);
        } else {
            System.out.println("No students in gradebook.");
        }
    }
}
