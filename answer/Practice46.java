package homework.wangdao.answer;

import java.util.Scanner;

public class Practice46 {
    public static void main(String[] args) {
        System.out.println("请依次输入两个字符串：");
        String a = new Scanner(System.in).next();
        String b = new Scanner(System.in).next();//输入两个字符串

        String newString = a.concat(b);//新字符串
        System.out.println(newString);
    }
}
