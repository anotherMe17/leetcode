package io.github.anotherme17.algorithms.middle;

/**
 * @author lirenhao
 * date: 2019/11/21 11:50 下午
 */
public class A5最长回文字符串 {

    public static void longestPalindrome(String s) {
        System.out.println(manacher(s));
    }

    public static char[] manacherString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append("#");
            sb.append(str.charAt(i));
        }
        sb.append("#");
        return sb.toString().toCharArray();
    }

    public static String manacher(String str) {
        if (str == null || str.length() < 1) {
            return "";
        }
        String maxPalindrome = "";
        char[] charArr = manacherString(str);
        int[] radius = new int[charArr.length];
        int R = -1;
        int c = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < radius.length; i++) {
            radius[i] = R > i ? Math.min(radius[2 * c - i], R - i + 1) : 1;
            while (i + radius[i] < charArr.length && i - radius[i] > -1) {
                if (charArr[i - radius[i]] == charArr[i + radius[i]]) {
                    radius[i]++;
                } else {
                    break;
                }
            }
            if (i + radius[i] > R) {
                R = i + radius[i] - 1;
                c = i;
            }

            if (max < radius[i]) {
                maxPalindrome = subManacherString(charArr, i, radius[i]);
                max = radius[i];
            }
        }
        return maxPalindrome;
    }

    public static String subManacherString(char[] charArr, int c, int radio) {
        StringBuilder sb = new StringBuilder();
        for (int i = c - radio + 2; i < c + radio; i += 2) {
            sb.append(charArr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        A5最长回文字符串.longestPalindrome("babade");
//        A5最长回文字符串.longestPalindrome("cbbd");
//        A5最长回文字符串.longestPalindrome("google");
        A5最长回文字符串.longestPalindrome("abcda");
//        A5最长回文字符串.longestPalindrome("pop-upu");
    }
}
