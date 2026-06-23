class Solution {
    public boolean isPalindrome(String s) {
         String s1="";
        String s2="";
        for(int i =0;i<s.length();i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch>='a'&&ch<='z'||Character.isDigit(ch))
            {
                s1=ch+s1;
                s2=s2+ch;
            }
        }
        return s1.equals(s2);
    }
}