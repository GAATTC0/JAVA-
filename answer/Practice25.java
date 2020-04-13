package homework.wangdao.answer;

import java.util.Scanner;

public class Practice25 {
    public static void main(String[] args) {
        System.out.println("请输入一个5位数：");
        int n = new Scanner(System.in).nextInt();   //输入一个5位数

        if(n < 10000 || n > 99999) {         //判断合法性
            System.out.println("ERROR！");
            return;
        }

        if((n % 10 == n / 10000) && ((n % 100) / 10 == (n / 1000) % 10)){  //回文数的条件
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}
