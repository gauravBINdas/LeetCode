class Solution {
    private int[] merge(int[] nums1,int[] nums2)
    {
        int res[]=new int[nums1.length+nums2.length];
        int left=0;
        int right=0;
        int k=0;
        while(left<nums1.length && right<nums2.length){
            res[k++]=(nums1[left]<nums2[right])?nums1[left++]:nums2[right++];
        }
        while(right<nums2.length)
        {
            res[k++]=nums2[right++];
        }
        while(left<nums1.length)
        {
            res[k++]=nums1[left++];
        }
        return res;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=merge(nums1,nums2);
        int x=arr.length/2;
        int y=(arr.length&1)==0?x-1:x;
        return (arr[x]+arr[y])/2.0;
    }
}