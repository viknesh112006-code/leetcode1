class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int a:nums){
            if(h.contains(a))
            {
                h.remove(a);
            }
            else
            {
                h.add(a);
            }
        }
        return h.iterator().next();
    }
}