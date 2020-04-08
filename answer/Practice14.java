package homework.wangdao;

import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year,month,day,sum = 0;             //定义年月日和天数
        System.out.println("请依次输入年月日：");//要求输入日期
        year = sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();
        if(year < 1 || month < 1 || month > 12 || day < 1 || day > 31) {    //判断合法性
            System.out.println("ERROR!");
            return;
        }

        switch (month) {        //用switch判断月份，利用穿透给sum赋值
            case 12:
                sum += 30;
            case 11:
                sum += 31;
            case 10:
                sum += 30;
            case 9:
                sum += 31;
            case 8:
                sum += 31;
            case 7:
                sum += 30;
            case 6:
                sum += 31;
            case 5:
                sum += 30;
            case 4:
                sum += 31;
            case 3:
                sum += 28;
            case 2:
                sum += 31;
            case 1:
                sum += day;
        }
        if (month > 2) {        //当月份大于2判断大小年
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                sum++;
            }
        }

        System.out.println("这是这年的第： " + sum + " 天");
    }
}
    

