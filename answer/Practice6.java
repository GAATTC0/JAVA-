package homework.wangdao;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(),n = sc.nextInt();
        int product = m * n;                                   // 乘积
        int fac,mul;                                           //定义公因数，公倍数
        if(m < 1 || n < 1){
            System.out.println("ERROR!");                       //判断合法性
        }else{
            if (m < n){                                         //排好大小
                int j = m;
                m = n;
                n = j;
            }
            int i = m % n;
            while(i != 0){                                      //辗转相除法求最大公约数
                m = n;
                n = i;
                i = m % n;
            }
            fac = n;
            mul = product / fac;                                //乘积除以最大公约数
            System.out.println("最大公约数为："+fac);
            System.out.println("最小公倍数为："+mul);
        }

    }

}
