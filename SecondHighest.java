public class SecondHighest {
    public static void main(String args[]){
        int[] arr = {3, 30, 34, 5, 9};
        largestNumber(arr);
    }
    public static void largestNumber(int[] nums){
        int maxValue = Integer.MIN_VALUE;
        System.out.println(maxValue);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        System.out.println(maxValue);
    }

}
