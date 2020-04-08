package homework.wangdao;

public class Practice42 {

        public static void main(String[] args) {

            int num = 0;
            for (int i = 10; i < 100; i++) {                           //循环尝试所有两位数
                if (809 * i == 800 * i + 9 * i + 1 && 8 * i < 100 && 9 * i > 99) {
                    num = i;                                        //找到则退出循环
                    break;
                }
            }

            if(num == 0){                                       //没有则输出不存在
                System.out.println("不存在");
                return;
            }
            System.out.println(num);
            System.out.println(num * 809);
        }
}


