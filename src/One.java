import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class One {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 ==> ");
        String name = s.nextLine();
        System.out.print("나이를 입력해주세요 ==> ");
        int age = s.nextInt();
        System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"살 입니다.");



    }
}