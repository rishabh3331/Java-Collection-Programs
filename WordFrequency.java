import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        // Step 1: Create a HashMap
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Step 2: Define the word array
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        // Step 3: Count word frequency
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Step 4: Print each word and its frequency
        System.out.println("Word Frequencies:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
