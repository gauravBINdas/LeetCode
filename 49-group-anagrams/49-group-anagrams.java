class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> Lol=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        char strChar[];
        String sortedStr=null;
        List<String> list=null;
        for(String str:strs)
        {
            strChar=str.toCharArray();
            Arrays.sort(strChar);
            sortedStr=Arrays.toString(strChar);
            if(!map.containsKey(sortedStr))
            {
                list=new ArrayList<>();
                list.add(str);
                map.put(sortedStr,list);
            }
            else
            {
                 list=map.get(sortedStr);
                 list.add(str);
            }
        }
        
        for(Map.Entry entrySet:map.entrySet())
        {
            Lol.add((List)entrySet.getValue());
        }
       return Lol;
        
    }
}