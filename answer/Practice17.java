package homework.wangdao;

public class Practice17 {
    public static void main(String[] args) {
        int sum = 1;        //定义总数
        for (int i = 0; i < 9; i++) {   //循环十次每天的吃法相同
            sum = (sum + 1) * 2;
        }

        System.out.println("摘了"+sum+"个桃子");//输出结果
    }
}
