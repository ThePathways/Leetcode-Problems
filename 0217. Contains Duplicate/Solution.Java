class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(final int num:nums){
            if(!set.add(num))
                return true;
        }
        return false;
        
    }
}
