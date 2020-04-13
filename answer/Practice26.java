package homework.wangdao.answer;

import java.util.Scanner;

public class Practice26 {
    public static void main(String[] args) {
        System.out.println("请输入星期的字母：");            //输入星期
        String week = new Scanner(System.in).next();        //偷懒了没判断输入合法性

        switch (week.charAt(0)){                //switch判断具体星期
            case 'S':
                if(week.charAt(1) == 'u'){      //开头重复则判断第二个字母
                    System.out.println("Sunday");
                }else{
                    System.out.println("Saturday");
                }break;
            case 'M':
                System.out.println("Monday");break;
            case 'T':
                if(week.charAt(1) == 'u'){
                    System.out.println("Tuesday");
                }else{
                    System.out.println("Thursday");
                }break;
            case 'F':
                System.out.println("Friday");break;
            case 'W':
                System.out.println("Wednesday");break;
        }

    }
}
