class Solution {
    interface Range{
            public int countOddTillRange(int val);
    }
   
    public int countOdds(int low, int high) {    
        Range range=(val)->(val>=0)? val/2+val%2 : 0;    
        int countOddTillLow=range.countOddTillRange(low-1);
        int countOddTillHigh=range.countOddTillRange(high);
        return countOddTillHigh-countOddTillLow;
    }
}