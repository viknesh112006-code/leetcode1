
class Solution {
    public int[] shortestToChar(String s, char c) {
        int a = s.length();
        int s1[] = new int[a];
        for(int i=0;i<a;i++)
        {
            int f=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;
            for(int j=i;j<a;j++)
            {
                if(s.charAt(j)==c)
                {
                    f=Math.abs(j-i);
                    break;
                }
            }
            for(int k=i;k>=0;k--)
            {

                if(s.charAt(k)==c)
                {
                b=Math.abs(k-i);
                break;
                }
            }
            if(f<b)
            {
                s1[i]=f;
            }
            else{
                s1[i]=b;
            }
        }
        return s1;
    }
}