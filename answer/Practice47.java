package homework.wangdao.answer;

import java.util.Random;

public class Practice47 {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {  //循环7次

            int n = new Random().nextInt(50) + 1;   //每次读取一个1-50的随机数
            for (int j = 0; j < n; j++) {
                System.out.print('*');  //打印*
            }
            System.out.println("");//换行
        }
    }
}
