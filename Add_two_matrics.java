public class Add_two_matrics {
  public static void main(String[] args) {
    int[][] mat1 = { { 6, 2, 8 },
                     { 1, 4, 2 } };
    int[][] mat2 = { { 5, 3, 2, },
                     { 5, 3, 8, } };
    int[][] result = { { 0, 0, 0 },
                       { 0, 0, 0 } };
    for (int i = 0; i < mat1.length; i++) {
      for (int j = 0; j < mat2[i].length; j++) {
      System.out.format("seting value for i=%d and j=%d/n",i,j);
      result[i][j] = mat1[i][j] + mat2[i][j];
      }
    }
    for (int i = 0; i < mat1.length; i++) {
      for (int j = 0; j <= mat2.length; j++) {
        System.out.print(result[i][j] + " ");
        result[i][j] = mat1[i][j] + mat2[i][j];
      }
      System.out.println("");
    }
  }
}