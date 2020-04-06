package homework.wangdao;
import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();                                           //输入成绩
        char grade = (score > 89) ? 'A' : ((score > 59) ? 'B' : 'C');       //嵌套比较出成绩
        System.out.println("成绩为："+grade);                               //打印成绩
    }
}
