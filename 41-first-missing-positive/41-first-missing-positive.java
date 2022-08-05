class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        for(int a: nums)
        {
            set.add(a);
        }
        int res=1;
        while(set.contains(res))
            res++;
        return res;
    }
}