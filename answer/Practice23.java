package homework.wangdao.answer;

public class Practice23 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {          //循环输出各年龄
            System.out.println(age(i));
        }
    }

	public static int age(int p){           //递归函数
		if(p == 1){
		    return 10;
        }else{
		    return age(p - 1) + 2;
        }
	}
}
