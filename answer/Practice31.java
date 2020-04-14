package homework.wangdao.answer;

import java.util.Arrays;

public class Practice31 {
    public static void main(String[] args) {
        int[] n ={1,2,3,4,5,6,7,8,9};//创建一个数组
        for (int i = 0,j = n.length -1; i < j; i++,j--) {   //循环交换首尾位置
            int tmp = n[i];
            n[i] = n[j];
            n[j] = tmp;
        }

        System.out.println(Arrays.toString(n)); //用类方法输出
    }
}
