public class Stack2 {
    Object[] st;    //stack에 사용할 배열
    int top = -1;
    int size;

    public Stack2(int size){
        st = new Object[size];
        this.size = size;
    }

    void push(Object e){
        if(top == size-1){
            System.out.println("스택이 가득 찼습니다");
        }
        else{
            top++;
            st[top] = e;
        }
    }

    Object pop(){
        if(top == -1){
            System.out.println("스택이 비어있습니다.");
            return 0;
        }
        else{
            Object remove = st[top];
            st[top] = null;
            top--;
            return remove;
        }
    }

    //스택의 탑에 위치한 element
    Object peek(){
        return st[top];
    }

    Object search(Object e){
        if(top == -1){
            System.out.println("스택이 비어있습니다.");
            return 0;
        }
        else{
            int i = 0;
            while(i <= top) {
                if (st[i] == e) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
            return i;
        }
    }

    void stackPrint(){
        for(int i = 0; i<=top; i++){
            System.out.print(st[i] + "  ");
        }
        System.out.println();
    }

    //스택의 탑이 저장된 index
    int top(){
        return top;
    }

    //스택의 전체 크기
    int size(){
        return size;
    }
}
