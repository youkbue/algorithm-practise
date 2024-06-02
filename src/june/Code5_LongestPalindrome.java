package june;

/**
 * <p> 题号5：最长回文子串 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/06/02 17:43
 */
public class Code5_LongestPalindrome {

    public String longestPalindrome(String s) {
        if(s == null) return "";
        if(s.length() < 2) return s;
        int start = 0, length = 0;
        //以每个字符串作为回文子串的中心
        for(int i = 0; i < s.length(); i++) {
            //奇数
            int len1 = getMaxLength(s, i, i);
            //偶数
            int len2 = getMaxLength(s, i , i + 1);
            int maxLen = Math.max(len1, len2);
            if(maxLen > length){
                length = maxLen;
                start = i - (length -1 ) / 2;
            }
        }
        return s.substring(start, start + length);
    }

    private int getMaxLength(String s,int l , int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}
