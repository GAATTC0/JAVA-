package homework.wangdao.answer;
/*
这道题感觉做的没有问题，编译运行都正常
但是输出的文件打开除了前两个数据外乱码，可能是int型不能用字节流输出？
这个问题我还没有解决，今后的学习中还得多了解一下
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Practice50 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);                //定义学生信息
        FileOutputStream fos = new FileOutputStream("stud.txt",true);
        String[] id = new String[5];    //学号
        String[] name = new String[5];//姓名
        double[][] score = new double[5][3];//三门课成绩
        double[] averageScore = new double[5];//平均成绩

        for (int i = 0; i < 5; i++) {   //输入学生信息
            System.out.println("请输入第"+(i+1)+"名学生的学号：");
            id[i] = sc.next();
            System.out.println("请输入第"+(i+1)+"名学生的姓名：");
            name[i] = sc.next();

            for (int j = 0; j < 3; j++) {
                System.out.println("请输入第"+(i+1)+"名学生的第"+(j+1)+"门课成绩：");
                score[i][j] = sc.nextInt();
            }

            averageScore[i] = (score[i][0]+score[i][1]+score[i][2]) / 3;//计算均值

        }

        for (int k = 0; k < 5; k++) {           //输出学生信息到文件
            fos.write(id[k].getBytes());
            fos.write(" ".getBytes());
            fos.write(name[k].getBytes());
            fos.write(" ".getBytes());
            for (int m = 0; m < 3; m++) {
                fos.write((int)score[k][m]); //不会把double转二进制，只能转int输出了。。
                fos.write(" ".getBytes());
            }
            fos.write((int)averageScore[k]);
            fos.write("\r\n".getBytes());
        }

        fos.close();    //关闭输出流
        System.out.println("文件输出成功！");
    }
}
