class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0];
            int min=0;
        for(int n:prices)
        {
            if(max>n)
            {
                max=n;
            }
            else {
                if(min<n-max)
                 {
                     min = n-max;   
                 } 
            }

        }
        return min;
    }
}