public class ListNode {
    ListNode prev;      //이전, 이후 노드를 기억할 수 있는 필드
    ListNode next;
    Object data;        //노드의 데이터

    public ListNode(){  //생성자1
        prev = null;
        next = null;
        data = null;
    }

    public ListNode(Object data){   //생성자2
        this.data = data;
        prev = null;
        next = null;
    }

    public ListNode(ListNode prev, ListNode next, Object data){  //생성자3
        this.prev = prev;
        this.next = next;
        this.data = data;
    }

}
