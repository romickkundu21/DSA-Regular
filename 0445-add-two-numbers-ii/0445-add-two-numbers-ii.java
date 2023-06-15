/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }

        int total=0,carry=0;
        ListNode res=null;
        while(!s1.isEmpty() || !s2.isEmpty()){
            int a=0,b=0;
            if(!s1.isEmpty())a=s1.pop();
            if(!s2.isEmpty())b=s2.pop();
            total=a+b+carry;
            ListNode temp=new ListNode(total%10);
            carry=total/10;
            if(res==null){
                res=temp;
            }else{
                temp.next=res;
                res=temp;
            }
        }
        if(carry!=0){
            ListNode temp1=new ListNode(carry);
            temp1.next=res;
            res=temp1;
        }
        return res;
    }
}