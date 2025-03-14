public class PrimeNumber {
    public static void main(String args[]){
        int num = 7;
        if(num <= 1) System.out.println( num + " Not a prime number"); 
        if (num <= 3) System.out.println(num + " a prime number"); 
        if (num % 2 == 0 || num % 3 == 0)  System.out.println( num + " Not a prime number"); 
        while(num > 2){
            if(num % 2 == 0) break;
            num--;
        }
    }
}
