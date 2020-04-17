package homework.wangdao.answer;

public class Practice41 {
    public static void main(String[] args) {
        int num = 4;
        while (true) {
            //执行方法IsNumber()查看桃子数是否符合要求
            if (IsNumber(num)) {
                break;
            }
            num++;//桃子数不合适加1
        }
        System.out.println("桃子数为："+num);
    }


    private static boolean IsNumber(int num) {
        int i = 0;
        while (i < 5) {
            //只有正确的桃子数i才会累加到5，返回true
            //反之不正常时，要么直接执行else，要么先执行1到3次if再执行else返回false
            if ((num - 1) % 5 == 0) {
                //(num-1)/5是每个猴子拿走的桃子，-1是每个猴子扔到海里的
                num = num - (num - 1) / 5 - 1;
                i++;
            } else
                return false;
        }

        return true;
    }
}

