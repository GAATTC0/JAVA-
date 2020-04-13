package homework.wangdao.answer;

import java.util.Scanner;

public class Practice29 {
    public static void main(String[] args) {

        System.out.println("请依次输入9个整数：");
        int[][] num = new int[3][3];        //创建二维数组
        for (int i = 0; i < 3; i++) {       //循环输入
            for (int j = 0; j < 3; j++) {
                num[i][j] = new Scanner(System.in).nextInt();
            }
        }

        System.out.println("矩阵对角线元素和为："+num[0][0]+num[1][1]+num[2][2]);//输出对角线之和
    }
}
