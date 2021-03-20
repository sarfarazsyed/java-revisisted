class Arrays {
  public static void main(String[] args) {
    int[] array1;
    int []array2;
    int array3[];

    array1 = new int[0];
    array2 = new int[4];
    array3 = new int[]{1,2,3,4};

    int[] array4 = {1,2,3,4,5};

    int[][] twoDimensionalArray1;
    int[] []twoDimensionalArray2;
    int[] twoDimensionalArray3[];
    int twoDimensionalArray4[][];
    int []twoDimensionalArray5[];
    int [][]twoDimensionalArray6 = {{1,2,3}, {3,2}, {1}, {4}};

    twoDimensionalArray1 = new int[10][20];
    twoDimensionalArray2 = new int[3][];
    twoDimensionalArray3 = new int[][]{{1,2}, {3,4}};
    /*
    twoDimensionalArray4 = {{1,2,3},{2,4,5},{4,4,5}}; // Compile time error
    */

    System.out.println("length of array : " + array4.length);
    System.out.println("length of array : " + twoDimensionalArray6.length);
    //output : 4
    System.out.println("length of array : " + twoDimensionalArray6[0].length);
    //output: 2
  }
}
