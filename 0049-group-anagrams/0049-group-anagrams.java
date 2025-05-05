import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to group anagrams using sorted word as key
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word to char array, sort it, and convert back to string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Add to map
            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Return all grouped anagram lists
        return new ArrayList<>(map.values());
    }
}
