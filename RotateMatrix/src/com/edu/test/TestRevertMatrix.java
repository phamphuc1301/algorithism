package com.edu.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import com.edu.matrix.Revert;

public class TestRevertMatrix {
  private Revert revert = new Revert();;
  int[][] nomalcase;
  int[][] expect; 
  @Before
  public void setUp() throws Exception {
    nomalcase = new int[][]{
      { 1, 2, 3, 4 },
      { 5, 6, 7, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 }
    };
    expect = new int[][]{
      { 13, 9, 5, 1 },
      { 14, 10, 6, 2 },
      { 15, 11, 7, 3 },
      { 16, 12, 8, 4 }
    };
  }
  
  @Test
  public void testNomalCase() {
    assertArrayEquals(expect, revert.rotateMatrix(nomalcase));
  }
  
}
