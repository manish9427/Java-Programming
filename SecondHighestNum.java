public class SecondHighestNum {
    public static void main(String args[]){
        int [] arr = {10,50,30,-40,50}; //50
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>highest){ //50>50
                secondHighest = highest; 
                highest = num; //50
            }
            else if(num>secondHighest && num!=highest){ //50>30 && 50==50
                secondHighest = num; // 30
            }
        }
        System.out.println(secondHighest);

    }
}
