package com.BasicSpringFramwork.Basics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service // business logic
@Qualifier("quick")
public class QucikSortAlgo implements SortAlgorithm{

    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Using Quicksort");
        return new int[0];
    }
}
