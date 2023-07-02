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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = -1;
            }
        }
        int rowStart=0;
        int rowEnd=m-1;
        int colStart=0;
        int colEnd=n-1;
        while(rowStart<=rowEnd && colStart<=colEnd && head!=null){
            for(int i=colStart;i<=colEnd;i++){
                if(head!=null){
                    res[rowStart][i]=head.val;
                    head=head.next;
                }
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                if(head!=null){
                    res[i][colEnd]=head.val;
                    head=head.next;
                }
            }
            colEnd--;
            if(rowStart<=rowEnd){
                for(int i=colEnd;i>=colStart;i--){
                    if(head!=null){
                        res[rowEnd][i]=head.val;
                        head=head.next;
                    }
                }
            }
            rowEnd--;
            if(colStart<=colEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    if(head!=null){
                        res[i][colStart]=head.val;
                        head=head.next;
                    }
                }
            }
            colStart++;
        }
        return res;
    }
}