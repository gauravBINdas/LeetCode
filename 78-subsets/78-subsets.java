class Solution {
    private int nums[];
    private List<List<Integer>> solve(List<Integer> prev,int curr)
    {
        List<Integer> select,notSelect;
        List<List<Integer>> newList=new ArrayList<>();
        List<List<Integer>> tmp=null;
        if(curr<nums.length){
            select=new ArrayList<>();
            notSelect=new ArrayList<>();

            select.addAll(prev);
            select.add(nums[curr]);

            notSelect.addAll(prev);

            tmp=solve(select,curr+1);
            if(tmp!=null)
                newList.addAll(tmp);
            tmp=solve(notSelect,curr+1);
            if(tmp!=null)
                newList.addAll(tmp);
        }
        else
        {
            newList.add(prev);
        }
        return newList;
    }
    public List<List<Integer>> subsets(int[] nums) {
        this.nums=nums;
        return solve(new ArrayList<>(),0);
    }
}