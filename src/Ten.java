import java.util.Random;

public class Ten {
    public static void main(String[] args) {
        int [][] arr = new int[8][8];
        Random r = new Random();
        int num = r.nextInt(16)+1;
        System.out.println(num + "개의 지뢰가 생깁니다");

        for(int i = 0; i<arr.length; i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = 0;
            }
        }

        int count = 0;

        while(count < num){
            int x = r.nextInt(8);
            int y = r.nextInt(8);

            if(arr[x][y] != 1){
                arr[x][y] = 1;
                count++;
            }

        }
        for(int i = 0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 1){
                    System.out.print("# ");
                }
                else{
                    System.out.print(". ");
                }
            }
            System.out.println();
            System.out.println("테스트합니다");
        }
    }
}
