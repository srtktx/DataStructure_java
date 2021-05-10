package tree;

import java.util.ArrayList;

public class BinTree extends Tree1{
    BinTree(){
        super();
    }

    //여기서 결론적으로는 TreeNode의 생성자 TreeNode(e)가 실행되는 것
    BinTree(Object e){
        super(e);   //e라는 root는 children이라는 arraylist를 자식으로 갖는다.
        super.getRoot().getChildren().add(null);    //왼쪽 자식
        super.getRoot().getChildren().add(null);    //오른쪽 자식
   }

    //트리가 비었는지 안비었는지
    public boolean isEmpty(){
        return super.size() == 0;   //size가 0이면 true리턴
    }

    //노드 n이 external인지 internal인지
    public boolean isExternal(BinNode n){
        //external
        if(n.getChildren().get(0)==null && n.getChildren().get(1)==null){
           // n.getLeft()==null && n.getRight()==null
            return true;
        }
        //internal
        else{
            return false;
        }
    }

    //Tree1에도 있는거니까 상속받기
    public BinNode getRoot(){
        return (BinNode)super.getRoot();
    }

    public BinNode getParent(BinNode n){
        return (BinNode)n.getParent();
    }

    //왼쪽 오른쪽 자식 모두 출력
    public ArrayList getAllChild(BinNode n){
        return super.getChildren(n);
    }
    //이 getChildren(인자있는애)은 Tree1꺼

    //왼쪽 자식 출력
    public BinNode getLeftChild(BinNode n){
        return (BinNode) n.getChildren().get(0);
    }
    //n.getLeft() 도 될듯
    //이 getChildren(인자없는애)는 TreeNode꺼

    //오른쪽 자식 출력
    public BinNode getRightChild(BinNode n){
        return (BinNode) n.getChildren().get(1);
    }
    //n.getRight()

    //Tree1에도 있는 함수. 상속받아쓰자
    public BinNode addRoot(Object e){
        BinNode root = (BinNode)super.addRoot(e);
        //자식자리 미리 두칸 만들어두자
        super.getRoot().getChildren().add(null);
        super.getRoot().getChildren().add(null);
        return root;
    }


    //root에 e값을 갖는 노드 add
//    public void addNode(Object e){

  //  }


    //n노드가 e값을 갖는 left child를 갖게 한다.
    public BinNode addLeftChild(BinNode n, Object e){
        BinNode left = null;

        if(!(n.getChildren().get(0) != null)){
            left = (BinNode)super.setChild(n,0,e);
            left.getChildren().add(null);
            left.getChildren().add(null);
        }
        return left;
/*        if(n.getChildren().get(0) == null){
          //  n.setLeft((BinNode) e);
            left = (BinNode)super.setChild(n,0,e);
        }
        else{
            System.out.println("이미 존재하는 값이 있습니다. 교체하겠습니다");
            //n.setLeft((BinNode) e);
            left = (BinNode)super.setChild(n,0,e);
        }
        left.getChildren().add(null);
        left.getChildren().add(null);

       return left;

*/    }

    //n노드가 e값을 갖는 right child를 갖게 한다.
    public BinNode addRightChild(BinNode n, Object e){
        BinNode right = null;

        if(!(n.getChildren().get(1) != null)){
            right = (BinNode)super.setChild(n,1,e);
            right.getChildren().add(null);
            right.getChildren().add(null);
        }
        return right;
        /*
        BinNode right = null;
        if(n.getChildren().get(0) == null){
            //  n.setLeft((BinNode) e);
            right = (BinNode)super.setChild(n,1,e);
        }
        else{
            System.out.println("이미 존재하는 값이 있습니다. 교체하겠습니다");
            //n.setLeft((BinNode) e);
            right = (BinNode)super.setChild(n,1,e);
        }
        return right;
    */
    }


}
