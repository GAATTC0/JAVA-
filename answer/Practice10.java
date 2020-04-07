package homework.wangdao;

public class Practice10 {
    public static void main(String[] args) {

        double length = 0,height = 100;  //定义经过路程和高度
        for(int i = 0;i < 10;i++){

                length = length + 2 * height; //每次落地时路程增加两倍高度
                height = height * 0.5;   //每次弹起为上次一半

        }

        System.out.println("第十次落地时共经过："+length+"米");//输出
        System.out.println("第十次反弹："+height+"米");

    }
}
