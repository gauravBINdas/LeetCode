class Solution {
    public int countOdds(int low, int high) {
        interface Range{
            public int countOddTillRange(int val);
        };
        Range range=(val)->(val>=0)? val/2+val%2 : 0;
       
        int countOddTillLow=range.countOddTillRange(low-1);
        int countOddTillHigh=range.countOddTillRange(high);
        return countOddTillHigh-countOddTillLow;
    }
}