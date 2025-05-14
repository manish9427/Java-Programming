public class PrimeNumber {
    public static void main(String args[]){
        int num = 717777;
        
//   int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

//   for (int prime : primes) {
//     if (num % prime == 0) System.out.println( num + " Not a prime number");
//   }
        if(num <= 1) System.out.println( num + " Not a prime number"); 
        if (num <= 3) System.out.println(num + " a prime number"); 
        if (num % 2 == 0 || num % 3 == 0)  System.out.println( num + " Not a prime number"); 
        for(int i=5;i*i<num;i=+6){
            if(num%i==0 || num%(i+2)==0) {System.out.println(num + "is not Prime");} 
        }
        System.out.println(num + " Prime Number");
    }
}
