import java.util.Scanner;

public class Five {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("두 정수를 입력해주세요 ==> ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int result = (num1 > num2) ?  num1 : num2;
        if (num1 == num2){
            System.out.println("두 정수가 같습니다.");
        }
        else
            System.out.println(result);
    }
}
