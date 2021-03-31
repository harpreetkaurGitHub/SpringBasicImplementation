package com.BasicSpringFramwork.Basics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service // business logic
@Qualifier("bubble")
//@Primary // will use this bean not quickSort bean
public class BubbleSort implements SortAlgorithm{

    public int[] sort(int[] numbers){

        // Implementation
        System.out.println("Using Bubblesort");

        return numbers;
    }
}
