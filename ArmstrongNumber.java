public class ArmstrongNumber {
    public static void main(String args[]){
        int num = 1634; // 1 + 125 + 27 = 153
        int sum = 0;
        int temp = num;
        int digits = String.valueOf(num).length(); //4
        System.out.println(digits);
        while(num>0){
            int digit = num %10;
            sum += Math.pow(digit,digits);
            num /= 10;
        }
        if(temp == sum){
            System.out.println(temp + " is an Armstrong number.");
        }else{
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
