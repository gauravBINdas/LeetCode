class MyCalendar {
    private List<Integer> bookedStartList;
    private List<Integer> bookedEndList;//end is excluded so,end==start is possible
    private int bookedEventCount;
    public MyCalendar() {
        bookedStartList=new ArrayList<>();
        bookedEndList=new ArrayList<>();
        bookedEventCount=0;
    }
    
    public boolean book(int start, int end) {
        boolean isValid=true;
        for(int i=0;i<bookedEventCount;i++)
        {
            if(start<bookedEndList.get(i)&&bookedStartList.get(i)<end)
            {
                isValid=false;
                break;
            }
        }
        if(isValid)
        {
            bookedStartList.add(start);
            bookedEndList.add(end);
            bookedEventCount++;
        }
        return isValid;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */