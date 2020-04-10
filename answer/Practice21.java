package homework.wangdao.answer;

public class Practice21 {
    public static void main(String[] args) {

        int sumi = 0,sumj = 1;                  //定义累加和与累乘和
        for (int i = 1; i <= 20; i++) {         //外层为所求的每一项
            for (int j = 1; j <= i; j++) {      //内层为每一项的因子求积
                sumj *= j;
            }
            sumi += sumj;
        }

        System.out.println("结果为："+sumi);//输出结果
    }
}
