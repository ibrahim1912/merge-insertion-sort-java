
import java.util.Random;
import java.lang.management.*;

public class Test {

    public static long getCPUTime() {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        return bean.isCurrentThreadCpuTimeSupported() ? bean.getCurrentThreadCpuTime() : 0L;
    }

    public static void main(String a[]){

        long startTime, endTime;

        int[] sortedArray1 = new int[1000];
        int[] randomArray1 = new int[1000];
        int[] worstArray1  = new int[1000];

        int[] sortedArray2 = new int[10000];
        int[] randomArray2 = new int[10000];
        int[] worstArray2  = new int[10000];

        int[] sortedArray3 = new int[100000];
        int[] randomArray3 = new int[100000];
        int[] worstArray3  = new int[100000];

        MergeSort mergeSort = new MergeSort();
        InsertionSort insertionSort = new InsertionSort();
        Random rand = new Random();

        for (int i=0; i<sortedArray1.length; i++) {
            sortedArray1[i] = i;
        }

        for (int i=0; i<randomArray1.length; i++) {
            randomArray1[i] = rand.nextInt(1000);
        }

        for (int i=0; i<worstArray1.length; i++) {
            worstArray1[i] = worstArray1.length-i-1;
        }

        for (int i=0; i<sortedArray2.length; i++) {
            sortedArray2[i] = i;
        }

        for (int i=0; i<randomArray2.length; i++) {
            randomArray2[i] = rand.nextInt(10000);
        }

        for (int i=0; i<worstArray2.length; i++) {
            worstArray2[i] = worstArray2.length-i-1;
        }

        for (int i=0; i<sortedArray3.length; i++) {
            sortedArray3[i] = i;
        }

        for (int i=0; i<randomArray3.length; i++) {
            randomArray3[i] = rand.nextInt(100000);
        }

        for (int i=0; i<worstArray3.length; i++) {
            worstArray3[i] = worstArray3.length-i-1;
        }

        startTime = getCPUTime();
        mergeSort.mergeSort(sortedArray1);
        endTime = getCPUTime();
        System.out.println("Merge Sort Best Case Sorting Time [Size:1.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        mergeSort.mergeSort(randomArray1);
        endTime = getCPUTime();
        System.out.println("Merge Sort Random Ordered Sorting Time [Size:1.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        mergeSort.mergeSort(worstArray1);
        endTime = getCPUTime();
        System.out.println("Merge Sort Worst Case Sorting Time [Size:1.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        insertionSort.insertionSort(sortedArray1);
        endTime = getCPUTime();
        System.out.println("Insertion Sort Best Case Sorting Time [Size:1.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        insertionSort.insertionSort(randomArray1);
        endTime = getCPUTime();
        System.out.println("Insertion Sort Random Ordered Sorting Time [Size:1.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        insertionSort.insertionSort(worstArray1);
        endTime = getCPUTime();
        System.out.println("Insertion Sort Worst Case Sorting Time [Size:1.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        mergeSort.mergeSort(sortedArray2);
        endTime = getCPUTime();
        System.out.println("Merge Sort Best Case Sorting Time [Size:10.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        mergeSort.mergeSort(randomArray2);
        endTime = getCPUTime();
        System.out.println("Merge Sort Random Ordered Sorting Time [Size:10.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        mergeSort.mergeSort(worstArray2);
        endTime = getCPUTime();
        System.out.println("Merge Sort Worst Case Sorting Time [Size:10.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        insertionSort.insertionSort(sortedArray2);
        endTime = getCPUTime();
        System.out.println("Insertion Sort Best Case Sorting Time [Size:10.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        insertionSort.insertionSort(randomArray2);
        endTime = getCPUTime();
        System.out.println("Insertion Sort Random Ordered Sorting Time [Size:10.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        insertionSort.insertionSort(worstArray2);
        endTime = getCPUTime();
        System.out.println("Insertion Sort Worst Case Sorting Time [Size:10.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        mergeSort.mergeSort(sortedArray3);
        endTime = getCPUTime();
        System.out.println("Merge Sort Best Case Sorting Time [Size:100.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        mergeSort.mergeSort(randomArray3);
        endTime = getCPUTime();
        System.out.println("Merge Sort Random Ordered Sorting Time [Size:100.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        mergeSort.mergeSort(worstArray3);
        endTime = getCPUTime();
        System.out.println("Merge Sort Worst Case Sorting Time [Size:100.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        insertionSort.insertionSort(sortedArray3);
        endTime = getCPUTime();
        System.out.println("Insertion Sort Best Case Sorting Time [Size:100.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        insertionSort.insertionSort(randomArray3);
        endTime = getCPUTime();
        System.out.println("Insertion Sort Random Ordered Sorting Time [Size:100.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");

        startTime = getCPUTime();
        insertionSort.insertionSort(worstArray3);
        endTime = getCPUTime();
        System.out.println("Insertion Sort Worst Case Sorting Time [Size:100.000] : " + (((double)endTime-(double)startTime)/1000000) + " milliseconds");
    }
}
