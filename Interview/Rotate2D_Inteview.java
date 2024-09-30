public class Rotate2D_Inteview {
    public static void main(String args[]){
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // Clockwise
        // {9,5,1}, {10,6,2},{11,7,3},{12,8,4}
        // AntiClockwise
        // {4,8,12}, {3,7,11},{2,6,10},{1,5,9}
        int [][] clockwise = rotateClockwise(arr);
        printMatrix(clockwise);
    }
    public static  int[][] rotateClockwise(int[][] matrix ){
          int rows = matrix.length;
          int cols = matrix[0].length;
          int rotated[][] = new int[cols][rows];
          for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                rotated[j][rows-1-i]=matrix[i][j];
            }
          }
          return rotated;
    }
    public static void printMatrix(int [][] arr){
        for(int[] row : arr){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
