import java.util.HashSet;
import java.util.Iterator;
public class hashSetIterator {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();

            set.add("Apple");
            set.add("Banana");
            set.add("Mango");
            set.add("Orange");
            set.add("Apple");

            System.out.println("After adding elements:");
            Iterator<String> itr = set.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

            set.remove("Banana");
            System.out.println("\nAfter removing 'Banana':");
            itr = set.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

            if (set.contains("Mango")) {
                System.out.println("\n'Mango' is present in the set.");
            } else {
                System.out.println("\n'Mango' is not in the set.");
            }
        }
    }
