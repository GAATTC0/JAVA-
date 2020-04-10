package homework.wangdao.answer;

public class Practice22 {
    public static void main(String[] args) {
        System.out.println(fn(5));      //调用递归
    }

    private static int fn(int n){       //递归函数
        if(n == 1){                     //结束条件
            return 1;
        }
       return n * fn(n - 1);        //递归公式
    }
}
