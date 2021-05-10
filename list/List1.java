import java.util.ArrayList;

public class List1 {                        //import를 이용한 배열리스트
    public static void main(String[] args){
        ArrayList arrList = new ArrayList();  //클래스 객체 생성

      //  arrList.add(1);
        if(arrList.isEmpty() == true){
            System.out.println("배열이 비어있습니다");
            arrList.add("a");
            arrList.add("b");
            arrList.add("c");
            arrList.add("d");
            arrList.add("e");
        }else{
            System.out.println("배열에 저장된 값이 있습니다.");
        }

        System.out.println(arrList);

        arrList.get(0);
        arrList.remove(0);
        arrList.set(1,2);

        System.out.println(arrList);            //ArrayList 클래스를 사용할때만 가능한 배열 출력. List2처럼 직접구현이면 for문 돌려서 출력
        System.out.println(arrList.size());
    }
}
