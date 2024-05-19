package may;

import may.write.Code3_LongestSubstringWithoutRepetitionsTemplate;

import java.util.HashMap;

/**
 * <p> 题号3：无重复最长子串 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/18 16:51
 */
public class Code3_LongestSubstringWithoutRepetitions {

    public int lengthOfLongestSubstring(String s) {
        Code3_LongestSubstringWithoutRepetitionsTemplate code3LongestSubstringWithoutRepetitions = new Code3_LongestSubstringWithoutRepetitionsTemplate();
        return code3LongestSubstringWithoutRepetitions.lengthOfLongestSubstring(s);
    }

    public static void main(String[] args) {
        Code3_LongestSubstringWithoutRepetitions solution = new Code3_LongestSubstringWithoutRepetitions();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // 输出: 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));    // 输出: 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   // 输出: 3
        System.out.println(solution.lengthOfLongestSubstring(""));         // 输出: 0
    }
}
