package homework.wangdao;

import java.util.Scanner;

public class Practice12 {

    public static void main(String[] args) {
        long profits, bonus = 0;   //定义奖金和利润,单位万
        System.out.println("请输入利润：");
        profits = new Scanner(System.in).nextLong();

        if (profits < 0) {                  //小于0报错，否则开始判断区间
            System.out.println("ERROR!");
        } else if (profits >= 1000000) {
            bonus = (long) (100000 * 0.1 + 100000 * 0.07 + 200000 * 0.05 + 400000 * 0.03 + 600000 * 0.015 + (profits - 1000000) * 0.001);
        } else if (profits >= 600000) {
            bonus = (long) (100000 * 0.1 + 100000 * 0.07 + 200000 * 0.05 + 400000 * 0.03 + (profits - 600000) * 0.015);
        } else if (profits >= 400000) {
            bonus = (long) (100000 * 0.1 * 100000 * 0.075 + 200000 * 0.05 + (profits - 400000) * 0.03);
        } else if (profits >= 200000) {
            bonus = (long) (100000 * 0.1 + 100000 * 0.075 + (profits - 200000) * 0.05);
        } else if (profits >= 100000) {
            bonus = (long) (100000 * 0.1 + (profits - 100000) * 0.075);
        } else {
            bonus = (long) (profits * 0.1);
        }

        System.out.println("奖金为："+bonus+"元"); //输出奖金
    }
}
