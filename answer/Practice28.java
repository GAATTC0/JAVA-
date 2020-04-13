package homework.wangdao.answer;

public class Practice28 {
    public static void main(String[] args) {
        int[] num = new int[]{8, 4, 65, 9, 4, 15, 6, 37, 45, 66};  //冒泡排序法
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < num.length; j++) {

                if (num[i] > num[j]) {
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }
    }
}
