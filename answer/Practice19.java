package homework.wangdao;

public class Practice19 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {               //前4行打印，外层控制行，内层控制列
            for (int j = 1; j < 8; j++) {
                if (j >= (4 - i) && j <= (4 + i)) { //判断条件满足打印'*'
                    System.out.print('*');
                } else {                            //不满足打印' '
                    System.out.print(' ');
                }
            }
            System.out.println("");
        }

        for (int i = 2; i > -1; i--) {          //后3行打印，原理同上
            for (int j = 1; j < 8; j++) {
                if(j >= (4 - i) && j <= (4 + i)){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println("");
        }
    }
}
