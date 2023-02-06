package dev.panasovsky.exam;


/**
 * {@see <a href="https://leetcode.com/problems/roman-to-integer/">Task at LeetCode</a>}
 */
public class LC13Easy {

    public int romanToArabicInteger(final String romanInteger) {

        int ans = 0, num = 0;
        for (int i = romanInteger.length() - 1; i >= 0; i--) {
            switch (romanInteger.charAt(i)) {
                case 'M' -> num = 1000;
                case 'D' -> num = 500;
                case 'C' -> num = 100;
                case 'L' -> num = 50;
                case 'X' -> num = 10;
                case 'V' -> num = 5;
                case 'I' -> num = 1;
            }
            if (2 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

}