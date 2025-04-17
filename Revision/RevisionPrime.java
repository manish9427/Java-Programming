package Revision;

public class RevisionPrime {
    public static void main(String args[]){
        int num = 7;
        if(isPrime(num)){
            System.out.println(num + " is Prime");
        }
        else{
            System.out.println(num + " is Not a Prime");
        }

        int upto = 100;
        printPrime(upto);
    }
    public static boolean isPrime(int num){
        for(int i = 2;i<num;i++){
            if(num %i ==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int num){
        for(int i=2;i<=num;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
