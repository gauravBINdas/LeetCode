class Solution {
    private HashMap<Character,String[]> initializeMap()
    {
        HashMap<Character,String[]> map=new HashMap<>();
        map.put('2',new String[]{"a","b","c"});
        map.put('3',new String[]{"d","e","f"});
        map.put('4',new String[]{"g","h","i"});
        map.put('5',new String[]{"j","k","l"});
        map.put('6',new String[]{"m","n","o"});
        map.put('7',new String[]{"p","q","r","s"});
        map.put('8',new String[]{"t","u","v"});
        map.put('9',new String[]{"w","x","y","z"});
        return map;
    }
    private List<String> bucket=new ArrayList<>();
    
    private void mixing(String ch[])
    {
        List<String> newBucket=new ArrayList<>();
        if(bucket.isEmpty())
        {
           newBucket=Arrays.asList(ch);
        }
        else{
            for(int i=0;i<bucket.size();i++)
            {
               for(int j=0;j<ch.length;j++)
               {
                   newBucket.add(bucket.get(i)+ch[j]);
               }
            }
        }
        bucket=newBucket;
    }
    
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String[]> map=initializeMap();
        
        for(int i=0;i<digits.length();i++)
        {
            mixing(map.get(digits.charAt(i)));
        }
        return bucket;
    }
}