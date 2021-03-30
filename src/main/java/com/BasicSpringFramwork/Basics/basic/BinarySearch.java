package com.BasicSpringFramwork.Basics.basic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {
    // Just the imaginary algo
    // Sorting the array
    // Search the array
    // Return the result

    // Importing interface SortAlgorithm for Dynamic switching
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    // Some methods for using Diffrent Autowiring -->
    // ::: @Primary for using one favorite algo
    // ::: By name : private SortAlgorithm bubbleSort;
    // ::: By @Qualify("abc"); :: it will use that algo without constructor and setter


    // ===== Now any one of them can be here (Setter or Constructor Injection) but
    // setter injection or no Injection nearly similar ======

    //Constructor Injection (MANDETORY CONDITIONS) -->
//    public BinarySearch(SortAlgorithm sortAlgorithm) {
//        super();
//        this.sortAlgorithm = sortAlgorithm;
//    }

      // Setter Injection (NON MANDATORY CONDITIONS) -->
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }


    // Some methods to use loosely coupled and tightly coupled -->
    public int binarySearch(int[] numbers, int numberToSearch) {

        // 1st way
        // Example of tightly coupled with bubble sort ==
//        BubbleSort bubbleSort = new BubbleSort();
//        int[] bubbleSortResult = bubbleSort.bubbleSort(numbers);
//        System.out.println(bubbleSortResult);


// !! ============================================================================ !!

        // 2nd way
        // Now we want to change the array so we will create Quick sort
        // with loosely couple we have changed the upper part
        // we make binary search use the interface to choose the algo ==
        int[] bubbleSortResult = sortAlgorithm.sort(numbers);
        System.out.println(bubbleSortResult);

        // Implementing the search logic
        // Search the array
        return 3;
    }
    // used after initialized the beans
    @PostConstruct
    public void init() throws Exception
    {
        System.out.println(
                "!!!! Beans has been "
                        + "instantiated and I'm the "
                        + "init() method !!!!");
    }

    // used before closing the spring container
    @PreDestroy
    public void destroy() throws Exception
    {
        System.out.println(
                "!!!! Container has been closed "
                        + "and I'm the destroy() method !!!!");
    }
}
