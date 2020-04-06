package homework.wangdao;

public class Practice2 {
    public static void main(String[] args) {
        int count = 0;                                   //计数器
        for (int i = 101; i < 201; i++) {
            for(int j=2;j<i;j++){                        //内层循环判断该数能否被整除
                if(i%j == 0){
                    break;                               //发现整除跳出内层循环
                }else if(j == i-1){
                    count++;                             //均不能整除，计数器++
                }
            }
        }

        System.out.println("101-200中素数有"+count+"个");
    }
}
