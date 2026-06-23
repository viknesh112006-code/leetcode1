class Solution {
    public String reverseOnlyLetters(String s) {
        char []st=s.toCharArray();
              int i=0;
      int j=st.length-1;
      while(i<j)
      {
       if(!Character.isLetter(st[i]))
       {
        i++;
       }
       else if(!Character.isLetter(st[j]))
       {
        j--;
       }
       else
       {
        char temp = st[i];
        st[i] = st[j];
        st[j]=temp;
        i++;
        j--;
       }
      }
      String s1="";
      for(int k=0;k<st.length;k++)
      {
        s1=s1+st[k];
      }
      return s1;
    }
}