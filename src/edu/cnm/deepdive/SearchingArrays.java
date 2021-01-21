package edu.cnm.deepdive;

import java.util.Arrays;

public class SearchingArrays {

  public static void main(String[] args) {
    int[] numbers = {0, 1, 3, 5, 6 ,7};

    System.out.println(Arrays.binarySearch(numbers, 2));//prints -3.
    System.out.println(Arrays.binarySearch(numbers, 5));
    System.out.println(Arrays.binarySearch(numbers, 4));//prints -4

    int[] notSortedNumbers = {5, 4, 10, 8, 6};
    System.out.println(Arrays.binarySearch(notSortedNumbers, 5));//prints 0, unpredicted result
    //because array is not sorted
    System.out.println(Arrays.binarySearch(notSortedNumbers, 8)); //prints -3 see remark above.

  }

}
