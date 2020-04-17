package homework.wangdao.answer;

/*
    这道题没看懂题意是啥，网上搜了一下原来是按字符串首字母排序
    那和对char数组排序有啥区别。。。
 */

import java.util.Comparator;

public class Practice40 {
    public static void main(String[] args) {
        String arr[] = new String[]{"boy", "Dog", "Apple", "Buy", "X man", "debug"};
        java.util.Arrays.sort(arr, new Comparator() {
            public int compare(Object arg0, Object arg1) {
                String str1 = (String) arg0;
                String str2 = (String) arg1;
                char ch1 = str1.charAt(0);
                char ch2 = str2.charAt(0);
                char ch1_up = Character.toUpperCase(ch1);
                char ch2_up = Character.toUpperCase(ch2);

                if (ch1_up == ch2_up) {
                    return ch1 - ch2;
                } else {
                    return ch1_up - ch2_up;
                }
            }
        });
        System.out.println(java.util.Arrays.toString(arr));

    }
}

