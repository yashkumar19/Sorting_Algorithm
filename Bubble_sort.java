
/**Time complexity ------> O(n^2) for average and worst case
 * for best case it will be O(n);
 * first it goes like n-1  n-2  n-3  n-4 .............. 2  1 = n^2/2 + n/2 ----> n^2
 * Here we just select the item and if it bigger than the adjacent element so it swap with it **/

class Bubble_sort{
    public static void main(String[] args) {
        int n =6;
        int[] arr = new int[]{13,46,24,52,20,9};
        sort(arr,n);
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr, int n){
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
