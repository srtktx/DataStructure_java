public class DoublyLinkedList {
    public ListNode head;   //리스트의 첫번째 노드
    public ListNode tail;   //리스트의 마지막 노드
    public int size;        //리스트의 크기

    public DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int i, Object e){
        ListNode node = new ListNode(e);  //(1)
        if(i == 0){      //리스트가 비어있다면
            addFirst(e);
        }
       // else if(i == size -1){    //이게 있으면 딜레마가 생긴다
         //   addLast(e);
       // }
        else{
            ListNode cur_prev = getNode(i-1);
            ListNode cur_next = cur_prev.next;
            //=getNode(i) 아직 교체 전이니까 cur_next는 prev의 다음 노드
            node.prev = cur_prev;   //추가한 노드의 전 후 설정 (2)
            node.next = cur_next;   //(3)
            //(4), (5)
            cur_prev.next = node;   //원래 노드의 이전 노드의 다음에 생성한 노드 저장
            cur_next.prev = node;    //생성한 노드의 next에 원래 노드 저장
            size++;
        }
    }
    public void addFirst(Object e){
        ListNode node = new ListNode(e);
        if(head == null){
            head = node;      //리스트의 첫번째, 마지막 노드는 동일
            tail = node;
        }
        else{       //첫째자리에 기존노드가 존재한다면
            node.next = head;   //생성한 노드의 next에 현재 헤드를 저장한다.
            head = node;        //헤드에는 생성한 노드를 저장한다.
        }
        size++;
    }
    public void addLast(Object e){
        ListNode node = new ListNode(e);
        if(head == null){
            addFirst(e);
        }
        else{       //마지막에 노드가 존재한다면
            tail.next = node;   //현재 테일의 다음에 생성한 노드를 저장
            node.prev = tail;   //생성한 노드의 prev에 현재 테일을 저장한다.
            tail = node;        //테일에는 생성한 노드를 저장한다.
        }
        size++;
    }
    public Object remove(int i){
        if(head == null){
            System.out.println("이미 비어있는 리스트");
            return null;
        }
        else{
            if(i==0){
                return removeFirst();
            }
            else if(i == size-1){
                return removeLast();
            }
            else{
                ListNode removeNode = getNode(i);
                ListNode prev_remove = removeNode.prev;
                ListNode next_remove = removeNode.next;
                prev_remove.next = next_remove; //이전노드의 next 설정
                next_remove.prev = prev_remove; //이후 노드의 prev설정
                size--;
                return removeNode.data;
            }
        }
    }
    public Object removeFirst(){
        if(head == null){
            System.out.println("이미 비어있는 리스트");
            return null;
        }
        else{
            ListNode removeNode = head;
            head = null;    //맨 앞 노드 삭제
            head = removeNode.next;     //삭제한 노드의 다음 노드가 헤드가 된다
            head.prev = null;       //새로 위치한 헤드의 이전 노드 링크를 끊어준다
            size--;
            return removeNode.data;
        }
    }
    public Object removeLast(){
        if(head == null){
            System.out.println("이미 비어있는 리스트");
            return null;
        }
        else{
            ListNode removeNode = tail;
            tail = null;
            tail = removeNode.prev;
            tail.next = null;
            size--;
            return removeNode.data;
        }
    }
    public void setNode(int i, Object e){
        ListNode current = getNode(i);
        current.data = e;
    }
    public ListNode getNode(int i){
        ListNode start = head;
        for(int j = 0; j<i; j++){   //찾는 인덱스 넘버만큼 반복
            start = start.next;     //다음다음 노드로 넘어가 저장
        }
        return start;
    }
    public void show_list(){
        for(int i = 0; i<size; i++){
            System.out.println(getNode(i).data);
        }
    }
}
