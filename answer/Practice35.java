package homework.wangdao.answer;

import java.util.Arrays;
import java.util.Scanner;

public class Practice35 {
    public static void main(String[] args) {
        int[] n = new int[5];       //创建数组

        for (int i = 0; i < 5; i++) {       //输入数组
            System.out.println("请输入第"+(i+1)+"个数：");
            n[i] = new Scanner(System.in).nextInt();
        }
        int max = 0,min = 0;        //设置最值下标

        for (int j = 0; j < 5; j++) {   //找出最值下标
            if(n[j] > n[max]){
                max = j;
            }
            if(n[j] < n[min]){
                min = j;
            }
        }

        int tmp1 = n[0];    //交换最值与首位
        n[0] = n[max];
        n[max] = tmp1;

        int tmp2 = n[4];
        n[4] = n[min];
        n[min] = tmp2;

        System.out.println(Arrays.toString(n));//打印数组
    }
}
