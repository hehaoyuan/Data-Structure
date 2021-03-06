//链表的环的入口点
public Node detectCycle(){
        Node fast = this.head;
        Node slow = this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        //无环，返回null
        if ((fast==null||fast.next==null)){
            return null;
        }
        slow = this.head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
    }
    return fast;
}


}
