package homework.wangdao;

import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请依次输入三个整数：");//输入三个整数
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int temp;                               //定义xyz和中间变量

        if(x > y){          //比较xy
            temp = x;
            x = y;
            y = temp;
        }

        if(x > z){          //比较xz
            temp = x;
            x = z;
            z = temp;
        }

        if(y > z){          //比较yz
            temp = y;
            y = z;
            z = temp;
        }
        System.out.println("由小到大为："+x+""+y+""+z);
    }
}
