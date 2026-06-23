class Solution {
    public String mergeAlternately(String s1, String s2) {
      String st ="";
      int i=0;
      while(i<s1.length()||i<s2.length())
      {
      if(i<s1.length())
      {
        st+=s1.charAt(i);
      }
      if(i<s2.length())
      {
        st+=s2.charAt(i);
      }
      i++;
      }
      return st;
    }
}