package Revision;

public class RevsionArmstrong {
    public static void main(String args[]){
        int num=153;
        int original = num;
        int sum =0;
        int digits = String.valueOf(num).length();
        while(num!=0){
            int digit = num%10;
            sum += Math.pow(digit,digits);
            num/=10;
        }
        if(sum==original){
            System.out.println(original + " is an Armstrong number");
        }else{
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
