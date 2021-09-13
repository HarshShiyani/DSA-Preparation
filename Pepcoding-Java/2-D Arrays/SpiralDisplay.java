
  11  12  13  14
  21  22  23  24
  31  32  33  34
  41  42  43  44
    
  in Spiral Means
  step 1: print first column -> 11  21  31  41
  step 2: print bottom row -> 42  43  44
  step 3: print right column -> 34  24  14
  step 4: print top column -> 13  12
  and so on util all elements could not print in spiral.
  (and same process with inner data and no repeatation allow)



import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] arr = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int minRow = 0;
    int minCol = 0;
    int maxRow = arr.length - 1;
    int maxCol = arr[0].length - 1;
    int total = row * col;
    int cnt = 0;

    while (cnt < total) {

      // Left wall
      for (int i = minRow, j = minCol; i <= maxRow && cnt < total; i++)       {
        System.out.println(arr[i][j]);
        cnt++;
      }
      minCol++;

      // Bottom wall
      for (int i = maxRow, j = minCol; j <= maxCol && cnt < total; j++) {
        System.out.println(arr[i][j]);
        cnt++;
      }
      maxRow--;

      // Right wall
      for (int i = maxRow, j = maxCol; i >= minRow && cnt < total; i--) {
        System.out.println(arr[i][j]);
        cnt++;
      }
      maxCol--;

      // Top wall
      for (int i = minRow, j = maxCol; j >= minCol && cnt < total; j--) {
        System.out.println(arr[i][j]);
        cnt++;
      }
      minRow++;
    }

  }

}
