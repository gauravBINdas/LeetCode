class Solution {
    public String intToRoman(int num) {
        int n;
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String s="";
        
        for(int i=0;i<13;i++){
            n=num/val[i];
            for(int j=0;j<n;j++)
                s=s+roman[i];
            num%=val[i];
        }
        return s;
        
    }
}