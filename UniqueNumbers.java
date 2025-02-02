import java.util.HashSet;

public class UniqueNumbers {
    public static void main(String[] args) {
        // Step 1: Create a HashSet
        HashSet<Integer> numbers = new HashSet<>();

        // Step 2: Add numbers (including duplicates)
        int[] inputNumbers = {10, 20, 30, 40, 50, 20, 30, 60};

        for (int num : inputNumbers) {
            numbers.add(num);
        }

        // Step 3: Print unique numbers
        System.out.println("Unique numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
