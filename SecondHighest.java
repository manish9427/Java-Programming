public class SecondHighest {
    public static void main(String args[]){
        int[] arr = {3, 30, 34, 5, 9};
        largestNumber(arr);
    }
    public static void largestNumber(int[] nums){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int num : nums){
            if(num> highest){
                secondHighest  = highest;
                highest = num;
            }else if(num>secondHighest && num!=highest){
                secondHighest = num;
            }
        }
        System.out.println(secondHighest);
    }

}
