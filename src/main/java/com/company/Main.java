package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
     //Problem Solving Find index of element when the left sum of index equal Right Sum of Index
        List<Integer> list=Arrays.asList(3,4,1,1);
        int sum = list.stream().mapToInt(Integer::intValue).sum();//10
//2
        IntStream.range(0, list.size()).reduce(0, (leftSum, rightSum) -> {
            //right
            Integer element = list.get(rightSum);//4
            if (leftSum == sum - leftSum - element) {//3
                System.out.println("Element " + element + " at index " + rightSum);//7
            }
            return leftSum + element; //3
        });

    }
}
