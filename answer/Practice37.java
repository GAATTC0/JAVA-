package homework.wangdao.answer;

import java.util.ArrayList;
import java.util.Scanner;
/*
这个题半天想不出来，无奈只能百度搜答案了QAQ
看了解析才发现ArraryList的灵活性，今后还是得多融合之前的知识思考问题而不是拘泥于一两种方法
 */

public class Practice37 {
    //    public static void main(String[] args) {
//        System.out.println("输入总人数：");
//        int n = new Scanner(System.in).nextInt();
//        int[] num = new int[n];
//        for(int i =0;i < n;i++){    //给每个元素编号
//            num[i] = i + 1;
//        }
//
//    }
//
//    public static int[] report(int[] num){
//        if(num.length == 1){
//            return num;
//        }else{
//
//            for (int j = 1; j <= num.length; j++) {
//                if(num[j] == 0){
//
//                }
//                if(j % 3 == 0){
//                    num[j] = 0;
//                }
//            }
//
//        }
//    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        /*
         * 第二种思路 一直遍历这个数组，每隔2个删除一个元素，直到只剩下一个元素 如果遇到了数组的结尾，那么就跳转到开头
         */
        int i = 0;
        while (list.size() != 1) {
            // 如果到了末尾，则重新回到开头
            if (i + 1 >= list.size()) {
                i = -1;
            } else if (i + 2 >= list.size()) {
                i = -2;
            }
            // 删除元素
            i = i + 2;
            System.out.println("删除" + list.get(i) + "号");
            list.remove(i);
        }
        System.out.println("最后剩下的人是" + list.get(0) + "号");
    }
}
