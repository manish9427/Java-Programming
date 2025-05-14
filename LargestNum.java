public class LargestNum {
    public static void main(String args[]){
        int[] arr = {3, 30, 34, 5, 9};
        largestNumber(arr);
    }
    public static void largestNumber(int[] nums){
        int maxValue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        System.out.println(maxValue);
    }

}
