class Solution {
    public void merge_sort(int arr[], int si, int ei) {
        if(si >= ei){
            return;
        }
        int mid = (si + ei)/2;
        merge_sort(arr, si, mid);// left part
        merge_sort(arr, mid+1, ei);// right part

        merge(arr, si, mid, ei);
    }
    public void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //itrator for temp[]

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){  //for remaining part of arr on left side
            temp[k++] = arr[i++];
        }
        while(j <= ei){  //for remaining part of arr on right side
            temp[k++] = arr[j++];
        }

        for(k=0,i=si; k<temp.length; k++,i++){  //copy temp[] values in orignal arr[]
            arr[i] = temp[k];
        }
    }
    public int[] sortArray(int[] nums) {
        merge_sort(nums,0,nums.length-1);
        return nums;
    }
}
