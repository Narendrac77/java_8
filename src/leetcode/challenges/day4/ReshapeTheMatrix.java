package src.leetcode.challenges.day4;

import java.util.Arrays;

//In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
//You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
//The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
//If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
//Example 1:
//
//
//Input: mat = [[1,2],[3,4]], r = 1, c = 4
//Output: [[1,2,3,4]]
//Example 2:
//
//
//Input: mat = [[1,2],[3,4]], r = 2, c = 4
//Output: [[1,2],[3,4]]
//https://leetcode.com/problems/reshape-the-matrix/
public class ReshapeTheMatrix {

    public static void main(String[] args) {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        reshapeTheMatrix.test1();
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat[i][j];
            }
        }
        return result;
    }

    public void test1() {
        int mat[][] = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int result[][] = matrixReshape(mat, r, c);
        System.out.println(Arrays.toString(result));
    }
}
