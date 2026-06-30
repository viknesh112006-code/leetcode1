class Solution {
    public void sortColors(int[] nums) {
     int i=0;
     int j=nums.length-1;
     int mid =0;
     while(mid<=j)
     {
        if(nums[mid]==0)
        {
            swap(nums,i,mid);
            i++;
            mid++;
        }
        else if(nums[mid]==1)
        {
            mid++;
        }
        else 
        {
            swap(nums,j,mid);
            j--;
        }
     }
    }
     private void swap(int [] nums, int k,int q )
     {
       int  temp = nums[k];
        nums[k]=nums[q];
        nums[q]=temp;
     }
}