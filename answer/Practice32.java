package homework.wangdao.answer;

import java.util.Scanner;

public class Practice32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个不小于7位的整数:");
        String str = sc.next();
        //将字符串转换为字符数组
        char[] ch = str.toCharArray();
        if(ch.length<7){
            System.out.println("输入不符合要求");
        }else{
            System.out.println(str+"从右边开始的4-7位是:"+ch[ch.length-7]+ch[ch.length-6]+ch[ch.length-5]+ch[ch.length-4]);
        }

    }
}
