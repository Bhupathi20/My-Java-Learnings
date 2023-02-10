import java.util.ArrayList;

public class stingsss {
    public static void main(String[] args) {
        // String name = "Bro";

        // boolean result = name.equalsIgnoreCase("bro");
        // System.out.println(result);


        // Array list

        // ArrayList<String> food  = new ArrayList<String>();

        // food.add("Pizza");
        // food.add("dosa");
        // food.add("idly");
        // food.add("puri");
        // food.add("sambar");

        // food.set(0, "vada");
        // food.remove(2);

        // for(int i=0; i<food.size(); i++){
        //     System.out.println(food.get(i));
        // }

        // 2D Array list in java

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList();

        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> veggies = new ArrayList<>();

        veggies.add("tomatoes");
        veggies.add("potatoes");
        veggies.add("kira");

        ArrayList<String> drinklist = new ArrayList<>();

        drinklist.add("peppisi");
        drinklist.add("coffee");

        groceryList.add(veggies);
        groceryList.add(drinklist);
        groceryList.add(bakeryList);

        System.out.println(groceryList.get(0).get(2));


    }
}
