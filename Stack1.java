import java.util.Stack;

public class Stack1 {       //자바클래스를 이용한 스택
    public static void main(String[] args){
        Stack st = new Stack();
        Object test = 'b';

        if(st.isEmpty()){
            st.push('a');
            st.push('b');
            st.push('c');
            System.out.println(st);
            System.out.println(st.search(test));
        }

        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
    }
}
