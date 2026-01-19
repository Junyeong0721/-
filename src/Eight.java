public class Eight {
    public static void main(String[] args){
        int[] number = {7, 3, 9, 2, 5};
        int big = number[0];
        int small = number[0];
        float avg = 0;
        for(int i = 0;i<number.length;i++){
            if(big < number[i]){
                big =number[i];
            }
            if(small > number[i]){
                small = number[i];
            }
            avg += number[i];
        }
        System.out.printf("최대값은 : %d 최소값은 : %d 평균은 : %.1f",big ,small, (avg/number.length));
    }
}

