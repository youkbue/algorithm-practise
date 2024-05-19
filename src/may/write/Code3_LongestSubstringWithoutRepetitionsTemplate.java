package may.write;

import java.util.HashMap;

/**
 * <p> 题号3：最长无重复子串模板 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/18 17:13
 */
public class Code3_LongestSubstringWithoutRepetitionsTemplate {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0 , l = 0, r = 0;
        char[] chars = s.toCharArray();
        while(r < s.length()){
            if(map.containsKey(chars[r]) && r >= l){
                int oldIndex = map.get(chars[r]);
                if(oldIndex < l) l = l;
                else l = oldIndex + 1;
            }
            max = Math.max(max, r - l + 1);
            map.put(chars[r], r);
            r++;
        }
        return max;
    }
}
