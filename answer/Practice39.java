package homework.wangdao.answer;

import java.util.Scanner;

public class Practice39 {
    public static void main(String[] args) {
        System.out.println("输入一个整数：");
        int n = new Scanner(System.in).nextInt();//输入一个数

        System.out.println("结果是："+method(n));//调用方法输出
    }

    public static double method(int n){
        double sum = 0;     //定义累加和

        if(n % 2 == 0){             //输入为偶数则用公式求和下面奇数同理
            for (double i = 2; i <= n; i += 2) {
                sum += (1 / i);
            }
        }else{
            for(double j = 1;j <= n;j += 2){
                sum += (1 / j);
            }
        }

        return sum; //返回累加和
    }
}
