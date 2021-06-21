package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheBigDiffTest {

  private int[][] diffParams = {
      {10, 3, 5, 6},
      {7, 2, 10, 9},
      {2, 10, 7, 2},
      {2, 10},
      {10, 2},
      {10, 0},
      {2, 3},
      {2, 2},
      {2},
      {5, 1, 6, 1, 9, 9},
      {7, 6, 8, 5},
      {7, 7, 6, 8, 5, 5, 6}
  };

  private int[] diffExpected = {7, 8, 8, 8, 8, 10, 1, 0, 0, 8, 3, 3};

  @Test
  void diffTest() {
    for (int i = 0; i < diffParams.length; i++) {
      int actual = CodingBatTheBigDiff.bigDiff(diffParams[i]);
      Assertions.assertEquals(actual, diffExpected[i]);
    }
  }

}