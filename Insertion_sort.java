
/**Time complexity ------> O(n^2) for average and worst case
 * for best case it will be O(n);
 * first it goes like 1, 2  3  4  5  6  7  8 ........n = n^2/2 + n/2 ----> n^2
 * Here we just select the range and the elment if it bigger than the adjacent element so it swap with it util reaches to its sorted order**/

class Insertion_sort{
    public static void main(String[] args) {
        int n =6;
        int[] arr = new int[]{13,46,24,52,20,9};
        sort(arr,n);
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[] arr, int n){
        for(int i=1; i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
