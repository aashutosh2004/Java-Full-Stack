import java.util.HashSet;
public class hashSetUniqueWords {
    public static void main(String[] args) {
        String input = "My name is Aashutosh Aashutosh is good and unique";
        HashSet<String> uniqueSet = new HashSet<>();
        String[] words = input.toLowerCase().split("\\W+"); //W+ matches one or more non-word character
        HashSet<String> dup = new HashSet<>();
        for(String s : words){
            if(!uniqueSet.add(s)){
                dup.add(s);
            }
        }

        System.out.println("Total no. of words: "+words.length);
        System.out.println("Total no. of Unique words: "+uniqueSet.size());
        System.out.println();
        System.out.print("Unique Words: ");
        for(String s : uniqueSet){
            System.out.print(s+" ");
        }

        System.out.println();
        System.out.print("Duplicate Words: ");
        for(String s : dup){
            System.out.print(s+" ");
        }
    }
}
