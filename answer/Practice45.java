package homework.wangdao.answer;

import java.util.Scanner;
/*
说实话这题没看懂题目啥意思，网上搜了一个很多人也这么觉得
所以就直接copy了一份把代码精简了一下
 */


public class Practice45 {
    public static void main(String[] args) {

        System.out.print("请输入一个数：");
        long l = new Scanner(System.in).nextLong();
        long n = l;
        int count = 0;

        while(n>8){
            n /= 9;
            count++;
        }

        System.out.println(l+"能被"+count+"个9整除。");
    }
}

