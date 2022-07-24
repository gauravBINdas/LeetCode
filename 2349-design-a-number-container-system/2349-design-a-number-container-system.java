/* Logic: Ghuiaa logic, sasura straight forward code likh dis hum toh.
   Resolution: Ro rahe h beth kr kone me
   Author: TLE se pareshan aatma
*/
class NumberContainers {
    private Map<Integer,TreeSet> map;
    private Map<Integer,Integer> map1;
    public NumberContainers() {
        map=new HashMap<>();
        map1=new HashMap<>();
    }
    
    public void change(int index, int number) {
        TreeSet<Integer> set;
        int another=-1;
        if(!map.containsKey(number))
        {
            //insert
            set=new TreeSet<>();
            set.add(index);
            map.put(number,set);
        }
        else
        {
            //update
            set=map.get(number);
            set.add(index);
        }
        //need to remove the index from another number
        if(map1.containsKey(index))
            another=map1.get(index);
        if(another>=1 && another!=number)
        {
            set=map.get(another);
            set.remove(index);
        }
        map1.put(index,number);
    }
    
    public int find(int number) {
        int index=-1;
        TreeSet<Integer> set=map.get(number);
        
        if(set!=null&&!set.isEmpty())
        {
            index=set.first();
        }
        return index;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */