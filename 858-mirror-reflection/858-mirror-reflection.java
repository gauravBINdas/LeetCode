class Solution {
    private interface Num
    {
        boolean isEven(int num);
    }
    public int mirrorReflection(int p, int q) {
        int m=1,n=0;
        Num num=(i)->(i&1)==0;
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
        if(!num.isEven(m)&&!num.isEven(n))
        {
            return 1;
        }
        else if(!num.isEven(m)&&num.isEven(n))
        {
            return 2;
        }
        else if(num.isEven(m)&&!num.isEven(n))
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}