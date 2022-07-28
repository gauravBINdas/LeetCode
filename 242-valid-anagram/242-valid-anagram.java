class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            if(map.containsKey(t.charAt(i))){
                int freq=map.get(t.charAt(i))-1;
                if(freq>0){
                    map.put(t.charAt(i),freq);
                }
                else
                {
                    map.remove(t.charAt(i));
                }
            }
            else
            {
                return false;
            }
        }
        if(map.isEmpty())
            return true;
        else
            return false;
        
    }
}