package Revision;
public class RevsionPrime{
    public static void main(String args[]){
        int num = 7;
        checkPrime(num);
    }
    public static  void checkPrime(int num){
        if(num<2){
            System.out.println(num + " is not a prime number");
            return;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(num + " is not a prime number");
                return;
            }
        }
        System.out.println(num + " is a prime number");
    }
}