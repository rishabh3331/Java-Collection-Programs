import java.util.ArrayList;

public class CityList {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList
        ArrayList<String> cities = new ArrayList<>();

        // Step 2: Add five city names
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Sydney");

        // Step 3: Use a loop to print each city
        System.out.println("List of Cities:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
