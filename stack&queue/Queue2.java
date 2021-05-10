public class Queue2 {
    Object[] que;   //큐에 사용할 배열
    int top = -1;
    int size;

    public Queue2(int size){
        que = new Object[size];
        this.size = size;
    }

    void enqueue(Object e){
        if(top == size-1){
            System.out.println("큐가 가득 찼습니다");
        }
        else{
            top++;
            que[top] = e;
        }
    }

    Object dequeue(){
        if(top == -1){
            System.out.println("큐가 비어있습니다");
            return 0;
        }
        else{
            Object remove = que[0];
            for(int i = 0; i<top; i++){
                que[i] = que[i+1];
            }
            que[top] = null;
            return remove;
        }
    }

    Object front(){
        return que[0];
    }

    Object rear(){
        if(front() == null){
            return null;
        }
        else{
            return que[top];
        }
    }

    Object search(Object e){
        if(top == -1){
            System.out.println("스택이 비어있습니다.");
            return 0;
        }
        else{
            int i = 0;
            while(i <= top) {
                if (que[i] == e) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
            return i;
        }
    }

    void queuePrint(){
        for(int i = 0; i<=top; i++){
            System.out.print(que[i] + "  ");
        }
        System.out.println();
    }

    Object top(){
        return top;
    }

    int size(){
        return size;
    }
}