//linked list reversal logic have 3 node pre curr post initial pre.next=null then 
//curr.next=pre then move pre and curr and post one step
public class lLReverse {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode pre=head;
        ListNode curr=head.next;
        ListNode post=head.next.next;
        pre.next=null;
        while(curr!=null){
            curr.next=pre;
            pre=curr;
            curr=post;
            if(post!=null)
            post=post.next;
        }
        return pre;
    }
}
