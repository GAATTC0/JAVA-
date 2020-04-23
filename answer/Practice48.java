package homework.wangdao.answer;

import java.util.Scanner;

public class Practice48 {
    public static void main(String[] args) {
        System.out.println("请输入密码：");
        String password = new Scanner(System.in).next();//输入密码
        char[] pass = password.toCharArray();//转为字符数组
        int a = pass[0] - '0',b = pass[1] - '0',c = pass[2] - '0',d = pass[3] - '0';//分拆每一位为int型

        int a1 = (a + 5) % 10,b1 = (b + 5) % 10,c1 = (c + 5) % 10,d1 = (d + 5) % 10;//执行加密操作
        int tmp = a1;
        a1 = d1;
        d1 = tmp;
        tmp = b1;
        b1 = c1;
        c1 = tmp;

        System.out.println("加密后为："+a1+""+b1+""+c1+""+d1);//输出结果
    }
}
