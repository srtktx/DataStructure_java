package tree;

public class BinNode extends TreeNode{
    //0은 왼쪽, 1은 오른쪽
    BinNode(){
        super();
    }

    BinNode(Object e){
        super(e);
    }

    //자식 노드 중 왼쪽 노드를 찾자
    public BinNode getLeft(){
        return (BinNode) super.getChildren().get(0);
    }

    //자식 노드 중 오른쪽 노드를 찾자
    public BinNode getRight(){
        return (BinNode) super.getChildren().get(1);
    }

    //왼쪽 자식 노드를 설정하자
    public void setLeft(BinNode n){
        super.getChildren().set(0, n);
    }

    //오른쪽 자식 노드를 설정하자
    public void setRight(BinNode n){
        super.getChildren().set(1, n);
    }
}
