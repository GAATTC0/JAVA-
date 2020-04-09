package homework.wangdao;

public class Practice16 {
    public static void main(String[] args) {

        System.out.println("     1    2    3    4    5    6    7    8    9");//表头
        for(int i = 1;i < 10;i++){

            System.out.print(i+"    ");             //对齐措施
            for(int j = 1;j < 10;j++){
                if(i * j < 10){                     //对齐措施
                    System.out.print(i * j +"    ");
                }else
                System.out.print(i * j +"   ");
            }
            System.out.println("");//换行
        }

    }
}
