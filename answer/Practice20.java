package homework.wangdao.answer;

public class Practice20 {
    public static void main(String[] args) {

        double x = 0,y = 0,sum = 0;         //定义分子x，分母y和和sum
        for (int i = 0; i < 20; i++) {
            if(i == 0){                 //第一次给xy赋初值
                x = 2;
                y = 1;
            }else {                 //然后根据规律变化后累加
                double tmp;
                tmp = y;
                y = x;
                x = tmp + y;

                sum += (x / y);
            }
        }

        System.out.println("结果是："+sum); //输出
    }
}
