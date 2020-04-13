package homework.wangdao.answer;

public class Practice27 {
    public static void main(String[] args) {
        int j;                              //定义j为全局变量
        for (int i = 2; i < 101; i++) {     //将i从2到100遍历
            for (j = 2; j < i; j++) {       //j从2到i - 1 遍历
                if(i % j == 0) break;
            }
            if(j == i){             //未发现i除了1和其本身的因子则为素数
                System.out.println(i);
            }
        }
    }
}
