package homework.wangdao;

public class Practice9 {
    public static void main(String[] args) {
        System.out.println("完数有：");

        for(int i = 1;i < 1001;i++){     //外层循环遍历1000内的数
            int sum = 0;                // sum为因子之和

            for(int j =1;j < i;j++){    //求sum
                if(i % j == 0){
                    sum += j;
                }
            }

            if(sum == i){               //判断是完数则输出
                System.out.println(i);
            }
        }
    }
}
