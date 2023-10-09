package Executors.mergesorter;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client {
    public static void main(String[] args) throws Exception {
       List<Integer>arr= List.of(1,6,9,7,3,0,2);
        ExecutorService executorService= Executors.newCachedThreadPool();
        MergeSorter mergeSorter=new MergeSorter(arr,executorService);


        Future<List<Integer>>futuresortedList=executorService.submit(mergeSorter);
        List<Integer>sortedList=futuresortedList.get();


        System.out.println(sortedList);
    }
}
