package homework.wangdao;

public class Practice3 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int ge = i%10;                                      //个位
            int shi = (i%100)/10;                               //十位
            int bai = (i - 10*shi - ge)/100;                    //百位
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){      //立方和
                System.out.println(i);
            }
        }
    }
}
