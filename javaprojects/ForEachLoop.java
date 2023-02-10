import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        
        // String[] animals = {"cat", "dog", "rat", "bird"};

        ArrayList<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("pig");
        animals.add("rat");

        for (String thing : animals) {
            System.out.println(thing);
        }


    }
}
