class Solution {
    public int romanToInt(String s) {
        int val[]={1000,500,100,50,10,5,1};
        char roman[]={'M','D','C','L','X','V','I'};
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<7;i++)
        {
            map.put(roman[i],val[i]);
        }
        
        
        int num=0;
        int prev=0;
        for(int i=0;i<s.length();i++)
        {
            int curr=map.get(s.charAt(i));
            num=(curr<=prev)?num+curr:num+curr-2*prev;
            prev=curr;            
        }
        return num;
    }
}