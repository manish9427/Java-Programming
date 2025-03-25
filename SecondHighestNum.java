public class SecondHighestNum {
    public static void main(String args[]){
        int [] arr = {10,50,30,-40,50};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>highest){
                secondHighest = highest;
                highest = num;
            }
            else if(num>secondHighest && num!=highest){
                secondHighest = num;
            }
        }
        System.out.println(secondHighest);

    }
}
