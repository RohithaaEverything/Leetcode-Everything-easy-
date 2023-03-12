class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode mm = head;		
        int i =traverse(mm,1);		
        i = (i/2);		
        while(i!=0){
            mm=mm.next;
            i--;
        }
        return mm;
    }
    private int traverse(ListNode mm, int i){
        if(mm.next!=null){
            mm = mm.next;
            i++;
            return traverse(mm,i);
        }
        else{
            return i;
        }
    }
}
