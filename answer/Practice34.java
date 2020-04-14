package homework.wangdao.answer;

import java.util.Arrays;
import java.util.Scanner;

public class Practice34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数：");
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(); //输入三个数

        int[] arr = {a,b,c};        //存入数组
        Arrays.sort(arr);           //排序
        System.out.println(Arrays.toString(arr));
    }
}
