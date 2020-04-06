package homework.wangdao;
import java.util.Scanner;
import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();     //创建要打印的因数表
        int n = sc.nextInt();
        int m = n;                                      //m保存输入的数
        for(int i=2;i<=n;i++){                          //找出最小因数放入表中
            if(n%i == 0){
                num.add(i);
                n = n/i;
                i = 1;
            }
        }
        System.out.print(m+"=");
        for (int i = 0; i < num.size(); i++) {          //输出因数表
            System.out.print(num.get(i));
            if(i < num.size()-1){
                System.out.print("*");
            }
        }
    }

}
