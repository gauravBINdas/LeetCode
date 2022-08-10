class Solution {
     private int next(int num)
     {
         int newNum=0;
         while(num!=0)
         {
             int temp=num%10;
             newNum+=temp*temp;
             num/=10;
         }
         return newNum;
     }
     public boolean isHappy(int n) {
        int turtle=n;
        int rabit=next(next(n));
        int end=1;
        while(rabit!=end && turtle!=rabit)
        {
            turtle=next(turtle);
            rabit=next(next(rabit));
        }
        return rabit==end;
    }
}