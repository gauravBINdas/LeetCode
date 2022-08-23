class Solution {
    List<String> bucket=new ArrayList<>();
    private void makeParenthesis(int l,int r,String formed)
    {
        String newFormed;
        if(l!=0||r!=0){
              if(l>0)
              {
                  newFormed=formed+"(";
                  makeParenthesis(l-1,r,newFormed);
              }
              if(l!=r && r>0)
              {
                  newFormed=formed+")";
                  makeParenthesis(l,r-1,newFormed);
              }
            }
        else
        {
            bucket.add(formed);
        }
    }
    public List<String> generateParenthesis(int n) {
        String newFormed="(";
        int l=n-1;
        int r=n;
        makeParenthesis(l,r,newFormed);
        return bucket;
    }
}