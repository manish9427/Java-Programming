package Revsion;

public class RevsionPrime {
    public static void main(String args[]){
        int num = 7;
        if(isPrime(num)){
            System.out.println(num + " is Prime");
        }
        else{
            System.out.println(num + " is Not a Prime");
        }
    }
    public static boolean isPrime(int num){
        for(int i = 2;i<num;i++){
            if(num %i ==0){
                return false;
            }
        }
        return true;
    }
}
