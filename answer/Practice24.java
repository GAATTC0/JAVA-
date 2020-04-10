package homework.wangdao.answer;

import java.util.Scanner;

public class Practice24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5位以内正整数：");
        int in = sc.nextInt();
        if(in <= 0 || in > 99999){          //检查输入合法
            System.out.println("ERROR!");
            return;
        }

        int weishu = 0;         //定义位数
        while(in > 0){        //当该数大于0时
            weishu++;           //每次位数+1
            System.out.print((in % 10)+" ");    //输出最后一位
            in /= 10;       //去掉最后一位
        }

        System.out.print('\n');
        System.out.println("位数为；"+weishu);
    }
}
