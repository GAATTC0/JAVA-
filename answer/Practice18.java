package homework.wangdao;

public class Practice18 {
    public static void main(String[] args) {
        char a,b,c;    //定义甲队3人

        for(a = 'x';a <= 'z';a++){                      //循环遍历所有情况
            for(b = 'x';b <= 'z';b++){
                for(c = 'x';c <= 'z';c++){
                    if(a != 'x' && c == 'y' && a != b && b != c && a != c){     //找出满足条件的情况
                        System.out.println("比赛名单为：");    //输出名单
                        System.out.println('a'+"-"+a);
                        System.out.println('b'+"-"+b);
                        System.out.println('c'+"-"+c);
                    }
                }
            }
        }
    }
}
