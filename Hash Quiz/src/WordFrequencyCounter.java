import java.util.HashMap;

public class WordFrequencyCounter {
    public static HashMap<String, Integer> countWordFrequency(String sentence) {
// Split the sentence into words
        String[] words = sentence.split(" ");
// Create a Hash.HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();
// Iterate through the words
        for (String word : words) {
            if (wordCountMap.containsKey(word)){
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
// If the word is already in the map, increment its count
// Else, add the word with count 1
// Write your code here
        }
// Return the word frequency map
        return wordCountMap;
    }

    public static void main(String[] args) {
// Example sentence
        String sentence = "apple banana apple orange banana apple";
// Get the word frequency map
        HashMap<String, Integer> result = countWordFrequency(sentence);
// Print the result
        System.out.println(result);
    }
}