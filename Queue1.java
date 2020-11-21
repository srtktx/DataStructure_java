import java.util.Queue;
import java.util.LinkedList;

public class Queue1{
    public static void main(String[] args){
        Queue que = new LinkedList();

        if(que.isEmpty()){
            que.offer('a');
            que.offer('b');
            que.offer('c');
            System.out.println(que);
        }
        System.out.println(((LinkedList) que).peekFirst());
        //System.out.println(que.peek());
        System.out.println(((LinkedList) que).peekLast());
        que.poll();
        System.out.println(que);
    }
}
