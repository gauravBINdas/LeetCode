class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        String hands="High Card";
        boolean isFlush=true;
        char card=suits[0];
        for( int i=0;i<ranks.length;i++)
        {
            if(suits[i]!=card)
                isFlush=false;
            int count=1;
            for(int j=i+1;j<ranks.length;j++)
            {
                if(ranks[i]==ranks[j])
                    count++;
            }
            if(count>=3)
                hands="Three of a Kind";
            else if(count==2&&!hands.equals("Three of a Kind"))
                hands="Pair";
        }
        if(isFlush)
            hands="Flush";
        
        return hands;   
    }
}