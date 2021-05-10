public class List2 {    //배열리스트 구현(java,util.ArrayList에 있는 메소드 구현)
    Object[] arr;
    int size;           //배열의 크기
    int top = -1;       //배열에서 마지막 값이 있는 인덱스번호, 스택이던 배열이던 top의 초기값은 -1

    List2(int size){
        arr = new Object[size];
        this.size = size;
        System.out.println(size + "크기의 배열리스트가 생성되었습니다.");
    }

    int size(Object[] arr){     //이 함수는 외부클래스에서 따로 배열을 생성하지 않는 이상, 이 클래스에서만 사용가능하다.
        return size;
    }   //배열의 크기 리턴

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    void arrPrint(){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }

    void addLast(Object e){
        if(top+1 > size){
            System.out.println("range overflow");
        }
        else{
            top++;
            arr[top] = e;
        }
    }

    void add(int index, Object e){
        if(top+1 > size){
            System.out.println("range overflow");
        }
        else{
            int temp = top;
            if(temp == size-1){         //배열이 꽉 차있을때
                for(int i = 0; i<size-index-1; i++){
                    arr[temp] = arr[temp-1];
                    temp--;
                }
                arr[index] = e;
            }
            else{                       //배열에 남은 공간이 있을때
                for(int i = 0; i<size-index-1; i++){
                    arr[temp + 1] = arr[temp];
                    temp--;
                }
                arr[index] = e;
                top++;
            }
        }
    }

    Object removeLast(){
        Object remove = 0;
        if(top == -1){
            System.out.println("더이상지울수 없습니다");
        }
        else{
            remove = arr[top];
            arr[top] = null;    //0으로 채워도 좋고
            top--;
        }
        return remove;
    }

    Object remove(int index){
        Object remove = arr[index];
        int temp = index;
        for(int i = 0; i<size-index-1; i++){
            arr[temp] =  arr[temp+1];
            temp++;
        }
        arr[top] = null;    //다 땡기고 나면 마지막 칸은 빌테니까
        top--;
        return remove;
    }

    Object get(int index){
        Object temp = arr[index];
        return temp;
    }

    Object set(int index, Object e){
        Object temp = arr[index];
        arr[index] = e;
        return temp;
    }
}