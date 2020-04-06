package homework.wangdao;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp1=1 ,cp2 = 0,cp3Up = 0 , sum = 0,month = sc.nextInt();//代表1，2和3以上月份兔子对数，month由键盘输入
        if(month < 1){
            System.out.println("ERROR!");
        }
        for (int i = 1; i < month; i++) {
            cp3Up += cp2;                   //3+月兔子为已经3+月的加 上个月2月大的
            cp2 = cp1 ;
            cp1 = cp3Up;
            }
        sum = cp1+cp2+cp3Up;
        System.out.println(month+"月份兔子对数为："+sum);
    }
}
