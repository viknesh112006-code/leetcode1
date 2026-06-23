class Solution {
    public int[] intersection(int[] n1, int[] n2) {
        Set <Integer> s1 = new HashSet<>();
        Set <Integer> r = new HashSet<>();
          for(int i=0;i<n1.length;i++)
          {
            s1.add(n1[i]);
          }
          for(int i=0;i<n2.length;i++)
          {
            if(s1.contains(n2[i]))
            {
            r.add(n2[i]);
            }
          }
          int a[] = new int[r.size()];
          int i=0;
          for(int f: r)
          {
            a[i++]=f;
          }
            return a;
    }
}