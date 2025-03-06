import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Test code here
  }


  public static int sumOfDiag(int[][] matrix)
  {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix[i].length;j++)
      {
        if (i==j)
        {
          sum += matrix[i][j];
        }
      }
    }
    return sum;
  }

  public static int[][] productTable(final int numRows, final int numCols)
  {
    int[][] multTable = new int[numCols][numRows];
    for (int i = 0; i < numsCols; i++)
    {
      for (int j = 0; j < numRows; j++)
      {
        multTable[i][j] = i*j;
      }
    }
    return multTable;
  }
}
