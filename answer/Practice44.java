package homework.wangdao.answer;

import java.util.Scanner;

public class Practice44 {
    public static void main(String[] args) {
        System.out.println("输入一个偶数：");
        int n = new Scanner(System.in).nextInt();//输入一个偶数
        if(n % 2 != 0 || n <= 2){       //判断输入合法性
            System.out.println("ERROR!");
            return;
        }

        for(int j = 2;j < (n / 2) + 1;j++){     //遍历从2到n/2的数，判断是否满足n等于两个质数和的条件
            if(judge(j) && judge(n - j)){
                System.out.println("可组成数为："+j+"+"+(n-j));
            }
        }
    }

    public static boolean judge(int n) {    //定义一个判断是否为质数的方法
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                break;
            }
            if(i == n -1){
                return true;
            }
        }
        return false;
    }
}
