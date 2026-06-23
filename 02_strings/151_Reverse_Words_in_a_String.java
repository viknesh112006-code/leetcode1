
class Solution {
    public String reverseWords(String s) {
        String a[]=s.trim().split("\\s+");
        StringBuilder an = new StringBuilder();
        for(int i = a.length-1;i>=0;i--)
        {
            an.append(a[i]);
            if(i!=0)
            {
                an.append(" ");
            }
        }
        return an.toString();
    }
}