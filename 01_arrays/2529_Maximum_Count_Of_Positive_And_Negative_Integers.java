class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int a=0;
        int c=0;
        for(int n: nums)
        {
            if(n<0)
            {
                a++;
            }
             else if(n>0){
                c++;
            }
           
        }
        if(a>c)
        {
            return a;
        }
        else
        {
            return c;
        }
        
    }
};