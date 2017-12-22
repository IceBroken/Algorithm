package com.algorithm.other;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其中数字、英文字母、空格、其它字符的个数
 */
public class CountStrNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Count use = new Count();
        use.count(ch);
    }
}

class Count {
    int digital, character, blank, other;

    public void count(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                digital++;
            } else if ((arr[i] >= 'a' && arr[i] <= 'z') || arr[i] >= 'A' && arr[i] <= 'Z') {
                character++;
            } else if (arr[i] == ' ') {
                blank++;
            } else {
                other++;
            }
        }
        System.out.println("数字个数为：" + digital);
        System.out.println("英文字符个数为：" + character);
        System.out.println("空格个数为：" + blank);
        System.out.println("其它字符个数为：" + other);
    }
}
