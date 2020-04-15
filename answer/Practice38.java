package homework.wangdao.answer;

import java.util.Scanner;

public class Practice38 {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");      //输入字符串
        String s = new Scanner(System.in).next();
        System.out.println(length(s));  //调用方法输出
    }

    public static int length(String s){     //返回字符串长度
        char[] arr = s.toCharArray();
        return arr.length;
    }
}
