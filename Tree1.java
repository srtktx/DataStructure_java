import java.util.ArrayList;

public class Tree1{
    private TreeNode root;
    public int TreeSize;    //tree 노드 개수

    Tree1(){
        root = null;
        TreeSize = 0;
    }
    Tree1(Object e){        //root 생성
        root = new TreeNode(e);
        TreeSize = 1;
    }

    public int size(){
        return TreeSize;
    }
    public TreeNode getRoot(){
        return root;
    }

    public ArrayList getChildren(TreeNode n){
        return n.getChildren();
    }

    public boolean isExternal(TreeNode n){
        return n.getChildren().isEmpty();       //이렇게 해야지 밑에처럼 하려면 node 생성자에서 자식에 리스트객체를 생성해주는걸 다른곳에서 해야한다.
     //   if(n.getChildren()==null){return true;}
     //   else{return false;}
    }

    //element가 e인 노드를 root로 추가
    public void addRoot(Object e){
        if(root == null){
            System.out.println("트리가 생성되었습니다.");
            root = new TreeNode(e);
            TreeSize = 1;
            root.level = 0;
        }
        else{
            System.out.print("이미 존재하는 루트가 있습니다..... ");
            System.out.println(" 트리의 루트를 교체했습니다");
            root = new TreeNode(e);
            TreeSize = 1;
            root.level = 0;
        }

    }

    //element가 e인 노드를 root의 자식으로 추가
    public void addNode(Object e){
        TreeNode node = new TreeNode(e);    //1. e를 값으로 갖는 새로운 노드를 생성한다.
        root.getChildren().add(node);  //2. 루트의 자식리스트에 새로운 노드를 추가한다.
        node.level = 1;
        TreeSize++;
    }

    //노드 n에 e값을 갖는 child를 추가
    public void addChild(TreeNode n, Object e){
        TreeNode node = new TreeNode(e);
        n.getChildren().add(node);  //2. 이미 생성되어 있는 자식리스트를 한 칸 늘린 후 생성한 노드를 저장한다
        node.level = n.level+1;
        TreeSize++;
    }

    //트리의 i번째 노드 자리에 e값을 갖는 child 삽입
    public void addChild(TreeNode n, int i, Object e){
        TreeNode node = new TreeNode(e);
        n.getChildren().add(i,node);
        node.level = n.level+1;
        TreeSize++;
    }

    //트리의 i번째 노드 n을 e값을 갖는 노드로 변경
    public void setChild(TreeNode n, int i, Object e){
        TreeNode node = new TreeNode(e);
        n.getChildren().set(i,node);
    }

    public TreeNode removeChild(TreeNode n, int i){
        TreeSize--;
        return (TreeNode) n.getChildren().remove(i);
    }
}