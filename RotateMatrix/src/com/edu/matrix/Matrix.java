package com.edu.matrix;

import java.util.Scanner;

public class Matrix {
  private int n;
  private int[][] array;

  public Matrix(int n) {
    super();
    this.n = n;
    array = new int[n][n];
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public int[][] getArray() {
    return array;
  }

  public void setArray(int[][] array) {
    this.array = array;
  }

  public void input() {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    for(int i = 0 ;i < n ;i++) {
      for(int j = 0;j < n;j++) {
      System.out.print("a["+i+"]["+j+"]\t");
      array[i][j] = Integer.parseInt(sc.nextLine());
      }
    }
  }

  public void print(int[][] array) {
    for(int i = 0 ;i < n ;i++) {
      for(int j = 0;j < n;j++) {
        System.out.print(array[i][j]+"|"+i+""+j+"|\t");
      }
      System.out.println();
    }
  }
}
