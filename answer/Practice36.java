package homework.wangdao.answer;

import java.util.Arrays;
import java.util.Scanner;

public class Practice36 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("请输入移动位数:");
        int m = new Scanner(System.in).nextInt();//输入移动位数
        if(m > n.length){               //判断合法性
            System.out.println("ERROR!");
            return;
        }

        int[] tmp = new int[n.length + m];//创建临时数组
        for (int i = 0; i < n.length; i++) {//临时数组从m开始赋原数组的值
            tmp[i + m] = n[i];
        }

        for(int j =0;j < n.length;j++){ //按要求把新值赋给原数组
            if(j < m){
                n[j] = tmp[j + n.length];
            }else {
                n[j] = tmp[j];
            }
        }

        System.out.println(Arrays.toString(n));//打印新数组
    }
}
