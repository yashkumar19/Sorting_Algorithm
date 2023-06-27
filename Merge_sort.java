import java.util.ArrayList;

/* --> Time complexity of that sort is O(NlogN)
   --> Here we just break the array and at lst we start sorting them and then merge them so for doing
	   we only take nlogn time

*/

public class Solution {
	public static void mergeSort(int[] arr, int n) {
		sort(0,n-1,arr);
	}

	public static void sort(int low, int high, int[] arr){
		if(low==high){
			return;
		}
		int mid = (low+high)/2;
		sort(low,mid,arr);
		sort(mid+1,high,arr);
		merge(low,mid,high,arr);
	}
	public static void merge(int low, int mid, int high , int[] arr){
		ArrayList<Integer> res = new ArrayList<>();
		int left = low;
		int right = mid+1;
		while(left<=mid && right<=high){
			if(arr[left]<=arr[right]){
				res.add(arr[left]);
				left++;
			}
			else{
				res.add(arr[right]);
				right++;
			}
		}
		while(left<=mid){
			res.add(arr[left]);
			left++;
		}
		while(right<=high){
			res.add(arr[right]);
			right++;
		}

		for(int i = low; i<=high; i++){
			arr[i] = res.get(i-low);
		}
	}
}
