class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int t = k*threshold;
        int sum=0,c=0;
        for (int i=0;i<k;i++) {
            sum+= arr[i];
        }
        if (sum >= t) 
        {

        c++;
        }
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum >= t)
            {
             c++;
            }
        }
        return c;
    }
}