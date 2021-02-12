package com.dnyanesh.fang.codes;

/*
 * Longest Increasing sub-sequence / Monotonic increasing sub-sequence
*/
public class LongestMonotonicSubSequence {
  public static int maxMonotonicSequenceLength(int[] elements) {
    int maxValue = 0;
    int positionOfMax = 0;
    int length = 0;
    for (int i = 2; i < elements.length; ++i) {
      if (elements[i] < maxValue) {
        int count = 1;
        int previousMaxElement = 0;
        for (int j = 1; j <= i-1; ++j) {
          if ((elements[j] < elements[i]) && previousMaxElement < elements[j]) {
            previousMaxElement = elements[j];
            count = count + 1;
            if (length < count) {
              length = count;
              positionOfMax = j;
              maxValue = elements[j];
            }
          }
        }
      } else {
        positionOfMax = i;
        maxValue = elements[i];
        length = length + 1;
      }
    }
    return length;
  }

  public static void main(String args[]) {
	  int[] list = {5,4,3,2,1,6,7,5,2,9,4,11};
	  System.out.println("lenght of subsequence: " + maxMonotonicSequenceLength(list));
  }
}