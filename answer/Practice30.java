package homework.wangdao.answer;

import java.util.Arrays;
import java.util.Scanner;

public class Practice30 {
    public static void main(String[] args) {
        int[] n = new int[]{1,5,6,8,9,45,89,96,451,2668,4864846};//随便创建一个排好序的数组
        System.out.println("请输入插入的数：");
        int newNum = new Scanner(System.in).nextInt();  //输入一个数

        int[] n1 = new int[n.length+1];     //新数组n1
        for (int i = 0; i < n.length; i++) {    //将n复制到n1
            n1[i] = n[i];
        }
        n1[n.length] = newNum;      //n1加上输入的元素
        Arrays.sort(n1);            //给n1排序
        n = n1;     //将n地址指向n1
        for (int i = 0; i < n.length; i++) {    //输出n
            System.out.println(n[i]);
        }
    }
}
