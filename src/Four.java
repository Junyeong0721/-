public class Four {
    public static void main(String[] args){
        for(int i = 0;i < 100;i++){
            if ((i+1)%3==0 || (i+1)%5==0)
                System.out.print(i+1+" ");
        }
    }
}
