package homework.wangdao;

public class Practice13 {
    public static void main(String[] args) {

        for (int i = 0; i < 100000; i++) {          //循环一万以内数用方法判断是否满足条件
            if(judge(i + 100) && judge(i + 368)){
                System.out.println("所求数为："+i);      //满足则输出
            }
            if(i == 1000000) System.out.println("未找到！");//没有则输出未找到
        }
    }

    public static boolean judge(int num) {          //判断是否为完全平方数方法
        for(int x = 1;x <= num / 2;x++) {
            if(x * x == num) {
                return true;
            }
        }
        return false;
    }
}
