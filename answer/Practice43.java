package homework.wangdao.answer;

import java.util.ArrayList;

public class Practice43 {
    public static void main(String[] args) {

        int sum = 0;    //定义题目所求的总数
        for (int i = 1; i < 76543210; i++) {    //遍历0-76543210内所有整数
            ArrayList<Integer> arri = split(i);
            if(arri.get(arri.size() - 1) % 2 == 0) continue;//偶数直接排除
            for(int j = 0;j < arri.size();j++){
                if(arri.get(j) == 8 || arri.get(j) == 9 ){  //检查每一位是否位=为8或9，是则排除
                    continue;
                }
                if(j == arri.size() - 1){   //符合条件sum加一
                    sum++;
                }
            }
        }

        System.out.println("符合条件奇数有："+sum+"个");
    }

    public static ArrayList<Integer> split(int n){          //定义一个获取整数每一位数字集合的方法
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n > 0){
            arr.add(n % 10);
            n /= 10;
        }
        return arr; //返回该集合
    }
}
