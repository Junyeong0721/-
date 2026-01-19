public class Six {
    public static void main(String[] args){
        int[][] ar1 = {{1,2,3},{4,5,6}};
        int i, j;
        int sum = 0;
        for (i =0;i<(ar1.length);i++){
            for(j = 0;j<(ar1[i].length);j++){
                sum+=ar1[i][j];
            }
        }
        System.out.println(sum);

    }
}
