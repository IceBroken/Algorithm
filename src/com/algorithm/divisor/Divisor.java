package com.algorithm.divisor;

import java.util.Scanner;

/**
 * 输入两个正整数,求最大公约数和最小公倍数（欧几里得算法）
 */
public class Divisor {
    public static void main(String[] args) {
        int a, b, m, n;
        System.out.println("请输入一个正整数：");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("再输入一个正整数：");
        b = sc.nextInt();
        CommonDivisor use = new CommonDivisor();
        m = use.commonDivisor(a, b);
        n = a * b / m;
        System.out.println("最大公约数：" + m);
        System.out.println("最小公倍数：" + n);
    }
}

class CommonDivisor {
    public int commonDivisor(int x, int y) {
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }
        while (y != 0) {
            if (x == y) return x;
            else {
                int k = x % y;
                x = y;
                y = k;
            }
        }
        return x;
    }
}