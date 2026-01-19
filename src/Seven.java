import java.util.Scanner;

public class Seven {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int j;
        int num = s.nextInt();
        for(int i = 1; i<(num+1); i++){
            for(j = 0;j<(num-i);j++){
                System.out.print(" ");
            }
            for (int a = 0;a<(num-j);a++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

