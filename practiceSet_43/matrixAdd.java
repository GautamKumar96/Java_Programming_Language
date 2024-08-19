import java.util.Scanner;
public class matrixAdd {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number of row:");
    int row = sc.nextInt();
    System.out.println("Enter number of column:");
    int column = sc.nextInt();

    int [] [] mat1 = new int [row] [column];
    int [] [] mat2 = new int [row] [column];
    
    int [] [] result = new int [row] [column];
  
    System.out.println("Enter elements of the frist matrix");
    enterMatrixElements(sc,mat1);
    System.out.println("Enter elements of the second matrix");
    enterMatrixElements(sc,mat2);


   for (int i=0; i<row; i++){
    for(int j=0; j<column; j++){
      result [i] [j] = mat1[i] [j] + mat2[i] [j];
    }
   }
   System.out.println("sum of the matrix:");
   displaymatrix(result);
  
  } 
  public static void enterMatrixElements(Scanner sc, int [][] matrix){
    for(int i=0; i<matrix.length; i++){
      for(int j=0;j<matrix.length; j++){
        matrix[i][j] = sc.nextInt();
      }
    }
  }
  public static void displaymatrix(int [][] matrix){
    for( int []  row : matrix){
      for(int[]  elem : matrix){
        System.out.println(elem+" ");
      }
      System.out.println();
    }
  }
}
