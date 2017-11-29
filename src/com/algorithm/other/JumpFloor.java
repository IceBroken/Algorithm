package com.algorithm.other;

import java.util.Scanner;

/**
 * 跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(jumpFloor(number));
    }

    public static int jumpFloor(int number) {
        if (number == 1)
            return 1;
        else if (number == 2)
            return 2;
        else
            return jumpFloor(number - 1) + jumpFloor(number - 2);
    }
}
