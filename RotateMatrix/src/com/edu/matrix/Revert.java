package com.edu.matrix;

public class Revert {
  public int[][] rotateMatrix(int[][] array) {
    int m = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = m; j < array.length; j++) {
        int tmp = array[i][j];
        array[i][j] = array[j][i];
        array[j][i] = tmp;
      }
      m++;
    }

    for (int i = 0; i < array.length; i++) {
      int end = array.length - 1;
      for (int j = 0; j < array.length; j++) {
        if (j >= end)
          break;
        int tmp = array[i][j];
        array[i][j] = array[i][end];
        array[i][end] = tmp;
        end--;
      }
    }
    return array;
  }
  
  public int[][] anotherWay(int[][] array) {
    
    return array;
  }
}
