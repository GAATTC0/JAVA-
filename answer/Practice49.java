package homework.wangdao.answer;

import java.util.Scanner;

public class Practice49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            //输入两个字符串
        System.out.println("请输入一个主字符串：");
        String st1 = sc.nextLine();
        System.out.println("请输入一个子字符串：");
        String st2 = sc.nextLine();
        int count = 0;          //定义匹配次数

        int i = 0,j = 0;        //模式匹配算法
        while (i < st1.length()){
            if(st1.charAt(i) == st2.charAt(j)){
                ++i;++j;
            }else{
                i = i - j + 1;
                j = 0;
            }
            if(j == st2.length()){
                count++;
                i = i - j + 1;
                j = 0;
            }
        }

        System.out.println("字串匹配次数为 "+count);//输出匹配次数
    }
}
