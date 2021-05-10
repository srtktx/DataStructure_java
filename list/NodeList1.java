import java.util.LinkedList;

public class NodeList1 {        //노드리스트 = linked list
    public static void main(String[] args){
        LinkedList list = new LinkedList();     //LinkedList 클래스의 객체를 생성

        list.add('a');
        list.add('b');
        list.add('c');
        list.addFirst('x');
        list.addLast('y');
        list.set(3,'a');
        list.remove(3);
        System.out.println(list);
        Object k = list.get(2);    //index 2의 값 가져오기
        Object j = list.getFirst();
        Object l = list.getLast();
        list.remove(k);
        System.out.println(list);

        int i = list.size();
        list.clear();
        if(list.isEmpty() == true){
            System.out.println("리스트가 비었다");
            System.out.println(i);      //clear는 remove와 달리 노드 자체를 삭제하는게 아니라 저장된 값만을 clear한다
        }
        else{
            System.out.println("리스트에 값이 있다");
        }
    }
}
