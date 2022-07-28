class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        //Initially left=0 and right=length is giving the max width possible
        // After that width will always decrease by 1 unit whether I increment left or decrement right.So ,the only factor remains to determine max area is height.
        //Now at curr iteration , I know my max height.I have to figure out if there's any max height possible in other end in next iteration.
        // continue till left surpasses right.
        while(left<right)
        {
            int width=right-left;
            max=Math.max(max,Math.min(height[left],height[right])*width);
            if(height[left]<=height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }
}