package cn.graceBaoXP;

/**
 * Rotate Image
 *
 * You are given an n x n 2D matrix representing an image.
 *
 * Rotate the image by 90 degrees (clockwise).
 *
 * Given input matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 * rotate the input matrix in-place such that it becomes:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 */
public class Leet48 {
    public static void rotate(int[][] matrix) {
        int length=matrix.length;
        for(int i=0;i<length/2;i++){
            for(int j=i;j<length-i-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[length-j-1][i];
                matrix[length-j-1][i]=matrix[length-i-1][length-j-1];
                matrix[length-i-1][length-j-1]=matrix[j][length-i-1];
                matrix[j][length-i-1]=temp;
            }
        }
    }
}
