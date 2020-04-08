package homework.wangdao;

public class Practice11 {
    public static void main(String[] args) {

        int a = 1,b = 2,c = 3,d = 4;                //定义每位可能的数
        int count =0;                               //符合要求总数
        for(int i = a;i < 5;i++){                   //3层循环找出所有符合情况

            for(int j = 1;j < 5;j++){

               for(int k = 1;k < 5;k++){
                   if(i != j && j != k && k != i){  //3位互不相等
                       count++;
                       System.out.println(i+""+j+""+k);//找到一个输出一次
                   }
               }
            }
        }
        System.out.println("共"+count);
    }
}
