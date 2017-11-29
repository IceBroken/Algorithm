package com.algorithm.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPalindrome = palindrome(number);
        System.out.println(isPalindrome);
    }

    /**
     * 判断是否为回文数
     */
    public static boolean palindrome(int number) {
        String numStr = String.valueOf(number);
        int half = numStr.length() / 2;
        for (int i = 0; i < half; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

/*    public static boolean palindrome(int number) {
        boolean isPalindrome = true;
        String numStr = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(numStr);
        stringBuilder.reverse();
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) != stringBuilder.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }*/
}
