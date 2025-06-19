import java.util.HashMap;
public class mapHash {
    public static void main(String[] args) {
        HashMap<String, Integer> marksMap = new HashMap<>();
        marksMap.put("Aashu", 45);
        marksMap.put("Rishi", 43);
        marksMap.put("Tushar", 42);
        boolean isPresent = marksMap.containsKey("Rishi");

        System.out.println("Is '" + "rishi" + "' present? " + isPresent);

        if (isPresent) {
            System.out.println("Rishi" + "'s marks: " + marksMap.get("Rishi"));
        }
        System.out.println();
        for(String name : marksMap.keySet()){
            System.out.println("Student "+name+", Score: "+ marksMap.get(name));
        }
    }
}
