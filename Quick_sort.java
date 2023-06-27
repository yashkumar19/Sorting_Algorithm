/*
---> The Timme Complexity of the algorithm is O(NlogN) and the Sapce Complexity is O(1)
---> Here we just take the Pivot and then we take two pointer and from left side find the elements 
     greater than pivot and from right side we find the elements smaller than pivot and than swap 
     those elements and if those pointer across each other that we swap both the elements each other 
     and then we partition(pivot's index) then again we split in two Part left part is before patition
     and right part is roght partitiom and do same process
*/
import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<Integer> quickSort(List<Integer> arr){
       sort(arr,0,arr.size()-1);
       return arr;
    }
    static void sort(List<Integer> arr, int low, int high){
        if(low<high){
            int index = partition(arr,low,high);
            sort(arr, low, index-1);
            sort(arr, index+1, high);
        }
    }

    static int partition(List<Integer> arr, int low, int high){
        int i = low;
        int j = high;
        int pivot = arr.get(low);
        while(i<j){
            while(arr.get(i)<=pivot && i<high){
                i++;
            }
            while(arr.get(j)>pivot && j>low){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    static void swap(List<Integer> arr ,int i, int j){
        int temp = arr.get(j);
        arr.set(j, arr.get(i));
        arr.set(i, temp);
    }
}
