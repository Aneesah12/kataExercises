package kata4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingDuplicates {

    public static int duplicateCounter(String str) {
        char[] dup = str.toLowerCase().toCharArray();

        // build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(Character ch : dup) {
            if(charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        int count = 0;
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if(entry.getValue() > 1) {
                entry.getKey();
                count ++;
            }
        }
        return count;
    }
}
