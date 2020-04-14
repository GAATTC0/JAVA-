package homework.wangdao.answer;

public class Practice33 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];

            for (int k = 0; k <= 10 - i; k++) {    //左边打印空格
                System.out.print(" ");
            }

            for (int j = 0; j < arr[i].length; j++) {       //右边打印数字

                if ( j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();           //换行
        }
    }
}