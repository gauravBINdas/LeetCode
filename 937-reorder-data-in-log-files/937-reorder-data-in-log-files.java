class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> logSort=new Comparator<>(){
            public int compare(String first,String second)
            {
                String firstArr[]=first.split(" ",2);
                String secondArr[]=second.split(" ",2);
                int contentCompare=0,idCompare=0;
                boolean isFirstDigit=Character.isDigit(firstArr[1].charAt(0));
                boolean isSecondDigit=Character.isDigit(secondArr[1].charAt(0));
            if(isFirstDigit&&isSecondDigit)
            {
                return 0;
            }
            else if(isFirstDigit&&!isSecondDigit)
            {
                return 1;
            }
            else if(!isFirstDigit&&isSecondDigit)
            {
                return -1;
            }
            else
            {
                contentCompare=firstArr[1].compareTo(secondArr[1]);
                idCompare=firstArr[0].compareTo(secondArr[0]);
                return contentCompare==0? idCompare:contentCompare;
            }
            }
        };
        
        Arrays.sort(logs,logSort);
        return logs;
    }
}