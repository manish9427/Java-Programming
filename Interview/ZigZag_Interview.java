public class ZigZag_Interview {
    public static void main(String args[]){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // Output matrix
        // 1,2,3,4,8,7,6,5,9,10,11,12
        zigzagTraversal(matrix);
    }
    public static void zigzagTraversal(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }else{
                for(int j=matrix[i].length-1;j>=0;j--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
}
