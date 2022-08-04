class Solution {
    public int mirrorReflection(int p, int q) {
        int m=1,n=0;
        while(m*p!=n*q)
        {
            if(n*q>m*p)
            {
                m++;
            }
            else if(n*q<m*p)
            {
                n++;
            }
        }
        if((m&1)!=0&&(n&1)!=0)
        {
            return 1;
        }
        else if((m&1)!=0&&(n&1)==0)
        {
            return 2;
        }
        else if((m&1)==0&&(n&1)!=0)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}