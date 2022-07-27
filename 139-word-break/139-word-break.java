/*
  Author: Chullu bhar paani laa de bhai. 
  Logic: String k shaktiyon ka galat istemal kiya hai maine
  
  Kone me rota hua coder
*/
class Solution {
    private char chars[];
    private List<String> wordDict;
    private Map<String,Boolean> map=new HashMap<>();
    private boolean word(String s,int curr)
    {
        String key=s+Integer.toString(curr);
        if(!map.containsKey(key)){
            boolean res;
            if(curr>=chars.length)
            {
                res=wordDict.contains(s);
            }
            else
            {
                String next=Character.toString(chars[curr]);
                if(wordDict.contains(s))
                {
                    res=word(next,curr+1)||word(s+next,curr+1);
                }
                else
                {
                    res=word(s+next,curr+1);
                }
            }
                map.put(key,res);
        }
        return map.get(key);
    }
    public boolean wordBreak(String s, List<String> wordDict) {
       chars=s.toCharArray();
       this.wordDict=wordDict;
       return word("",0);
    }
}