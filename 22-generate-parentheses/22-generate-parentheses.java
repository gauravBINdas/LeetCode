class Solution {
    private List<String> makeParenthesis(int l,int r,String formed)
    {
        String newFormed;
        List<String> bucket=new ArrayList<>();
        if(l!=0||r!=0){
          if(l>0)
          {
              newFormed=formed+"(";
              bucket.addAll(makeParenthesis(l-1,r,newFormed));
          }
          if(l!=r && r>0)
          {
              newFormed=formed+")";
              bucket.addAll(makeParenthesis(l,r-1,newFormed));
          }
        }
        else
        {
            bucket.add(formed);
        }
        return bucket;
    }
    public List<String> generateParenthesis(int n) {
        return makeParenthesis(n,n,"");
    }
}