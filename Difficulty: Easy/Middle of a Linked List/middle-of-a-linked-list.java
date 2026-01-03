class Solution {
    int getMiddle(Node head) {
        // code here
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int mid=count/2 ;
        for(int i=0;i<mid;i++){
            temp=temp.next;
        }
        return temp.data;
    }
}