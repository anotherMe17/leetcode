package io.github.anotherme17.algorithms.middle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lirenhao
 * date: 2019-08-22 10:03
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class A3无重复字符的最长子串 {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int max = -1;
        int last = -1;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                last = Math.max(map.get(s.charAt(i)), last);
            }
            max = Math.max(i - last, max);
            map.put(s.charAt(i), i);
        }
        return max == -1 ? len : max;
    }

    public static void main(String[] args) {
        A3无重复字符的最长子串 无重复字符的最长子串 = new A3无重复字符的最长子串();
        System.out.println(无重复字符的最长子串.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(无重复字符的最长子串.lengthOfLongestSubstring("bbbbb"));
        System.out.println(无重复字符的最长子串.lengthOfLongestSubstring("pwwkew"));
        System.out.println(无重复字符的最长子串.lengthOfLongestSubstring(" "));
        System.out.println(无重复字符的最长子串.lengthOfLongestSubstring(""));
        System.out.println(无重复字符的最长子串.lengthOfLongestSubstring("au"));
        System.out.println(无重复字符的最长子串.lengthOfLongestSubstring("aab"));
        System.out.println(无重复字符的最长子串.lengthOfLongestSubstring("abba"));
        System.out.println(无重复字符的最长子串.lengthOfLongestSubstring("dvdf"));
    }
}
