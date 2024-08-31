//带有输入输出
// hot7：无重复字符的最长子串
import java.util.HashMap;

public class hot7_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        int start =-1;
        int end =0;
        int ans =0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(;end <s.length();end++){
            if (hashMap.containsKey(s.charAt(end))){
                start = Math.max(start,hashMap.get(s.charAt(end)));
            }
            hashMap.put(s.charAt(end),end);
            ans = Math.max(ans,end-start);
        }
        return ans;
    }

    public static void main(String[] args){
        hot7_lengthOfLongestSubstring hot7LengthOfLongestSubstring = new hot7_lengthOfLongestSubstring();
        String s = "abcabcbb";
        System.out.println("输入 = " + s);
        int result = hot7LengthOfLongestSubstring.lengthOfLongestSubstring(s);
        System.out.println("输出：" + result);
    }
}
