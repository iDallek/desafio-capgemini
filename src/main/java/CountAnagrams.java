import java.util.Arrays;
import java.util.HashMap;

public class CountAnagrams {

    // href: https://www.geeksforgeeks.org/count-total-anagram-substrings/
    public int count(String word){
        HashMap<String, Integer> map= new HashMap<>();

        for(int i = 0; i < word.length(); i++){
            for(int j = i; j < word.length(); j++){
                char[] valC = word.substring(i, j+1).toCharArray();

                Arrays.sort(valC);
                String val = new String(valC);

                if (map.containsKey(val)) {
                    map.put(val, map.get(val)+1);
                } else {
                    map.put(val, 1);
                }
            }
        }
        int anagramPairCount = 0;

        for(String key: map.keySet()){
            int n = map.get(key);
            anagramPairCount += (n * (n-1))/2;
        }

        return anagramPairCount;
    }
}
