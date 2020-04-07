package homework.wangdao;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被加数a：");//输入被加数
        int a = sc.nextInt();
        System.out.println("请输入被加次数n：");//输入项数
        int n = sc.nextInt();
        if (a < 1 || a > 9 || n < 1) {          //判断输入合法性
            System.out.println("ERROR!");
        } else {
            int sum = 0;            //累加和

            //计算累加和
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    sum = (int) (sum + a * Math.pow(10, j - 1));
                }
            }
            //输出结果
            System.out.println("结果是：" + sum);
        }
    }
}