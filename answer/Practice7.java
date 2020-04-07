package homework.wangdao;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0,letter = 0,space = 0,num = 0,other =0;//定义各变量
        //遍历数组统计各数量
        while(i < str.length()){
            if(str.charAt(i) == ' '){
                space++;
            }else if((65 <= str.charAt(i) &&str.charAt(i) <= 90) || (97 <= str.charAt(i) &&str.charAt(i) <= 122)){
                letter++;
            }else if('0' <= str.charAt(i) && str.charAt(i) <= '9'){
                num++;
            }else{
                other++;
            }
            i++;
        }
        //打印统计的值
        System.out.println("num:"+num);
        System.out.println("space:"+space);
        System.out.println("letter:"+letter);
        System.out.println("other:"+other);
    }
}
