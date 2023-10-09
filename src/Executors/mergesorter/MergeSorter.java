package Executors.mergesorter;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer>arrayToSort;
    private ExecutorService executorService;
    public MergeSorter(List<Integer> arrayToSort,ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService=executorService;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size()<=1){
            return arrayToSort;
        }
        int mid=arrayToSort.size()/2;
        List<Integer>leftArray=new LinkedList<>();
        List<Integer>rightArray=new LinkedList<>();

        for (int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }
        for (int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

        MergeSorter leftMergrsort=new MergeSorter(leftArray,executorService);
        MergeSorter rightMergesort=new MergeSorter(rightArray,executorService);

       // ExecutorService executorService= Executors.newCachedThreadPool();

       Future<List<Integer>>leftSortedArrayFuture =executorService.submit(leftMergrsort);
       Future <List<Integer>>rightSortedArrayFuture=executorService.submit(rightMergesort);

       List<Integer>leftSortedArray=leftSortedArrayFuture.get();
       List<Integer>rightSortedArray=rightSortedArrayFuture.get();

        int i=0;
        int j=0;
        List<Integer>sortedArray=new LinkedList<>();
        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;

            }
            else{
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }


        }
        while(i<leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while(j<rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }


        return sortedArray;
    }
}
