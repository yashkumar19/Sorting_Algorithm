
/**Time complexity ------> O(n^2) 
 * first it goes like n  n-1  n-2  n-3  n-4 .............. 2  1 = n^2/2 + n/2 ----> n^2 
 * here we just select the item and find the minimum and then just swap that minimum element from that element**/


class Selection_sort {
    public static void main(String[] args) {
        int n =6;
        int[] arr = new int[]{13,46,24,52,20,9};
        sort(arr,n);
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[] arr,int n){
        for(int i=0; i<=n-2; i++){
            int mini = i;
            for(int j=i; j<=n-1; j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
}
