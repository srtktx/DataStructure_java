package tree;

import java.util.ArrayList;

public class Tree1{
    private TreeNode root;
    public int TreeSize;    //tree 노드 개수

    public Tree1(){
        this.root = null;
        this.TreeSize = 0;
    }
    public Tree1(Object e){        //root 생성
        this.root = new BinNode(e);
        this.root.setChildren(new ArrayList());
        this.TreeSize = 1;
    }

    public int size(){
        return this.TreeSize;
    }

    public TreeNode getRoot(){
        return this.root;
    }

    public ArrayList getChildren(TreeNode n){
        return n.getChildren();     //TreeNode의 getChildren()
    }

    public boolean isExternal(TreeNode n){
        return n.getChildren().isEmpty();       //이렇게 해야지 밑에처럼 하려면 node 생성자에서 자식에 리스트객체를 생성해주는걸 다른곳에서 해야한다.
     //   if(n.getChildren()==null){return true;}
     //   else{return false;}
    }

    //element가 e인 노드를 root로 추가
    public TreeNode addRoot(Object e){
        if(this.root == null){
            System.out.println("트리가 생성되었습니다.");
            this.root = new BinNode(e);
            this.root.setChildren(new ArrayList());
            this.TreeSize = 1;
            this.root.level = 0;
        }
        else{
            System.out.print("이미 존재하는 루트가 있습니다..... ");
            System.out.println(" 트리의 루트를 교체했습니다");
            this.root = new BinNode(e);
            this.TreeSize = 1;
            this.root.level = 0;
        }
        return this.root;
    }

    //element가 e인 노드를 root의 자식으로 추가
    public TreeNode addNode(Object e){
        TreeNode node = new BinNode(e);    //1. e를 값으로 갖는 새로운 노드를 생성한다.
        node.setChildren(new ArrayList());  //2. 새로운 노드도 자식리스트를 갖게 해준다(sub트리 완성)
        node.setParent(this.root);          //3-1. 해당 트리의 부모를 root로 정해준다
        this.root.getChildren().add(node);  //3-2. 루트의 자식으로 해당 트리를 붙여준다
        node.level = 1;
        this.TreeSize++;
        return node;
    }

    //노드 n의 자식으로 e값을 갖는 child를 추가
    public TreeNode addChild(TreeNode n, Object e){
        TreeNode node = new BinNode(e);
        node.setChildren(new ArrayList());
        node.setParent(n);
        n.getChildren().add(node);  //null인 자식 리스트에 생성한 노드를 저장한다
        node.level = n.level+1;
        this.TreeSize++;
        return node;
    }

    //노드 n의 자식 리스트에서 i번째 자리에 e값을 갖는 child 삽입
    public TreeNode addChild(TreeNode n, int i, Object e){
        TreeNode node = new BinNode(e);
        node.setChildren(new ArrayList());
        node.setParent(n);
        n.getChildren().add(i,node);
        node.level = n.level+1;
        this.TreeSize++;
        return node;
    }

    //노드 n의 i번째 자식을 e값을 갖는 child로 변경
    public TreeNode setChild(TreeNode n, int i, Object e){
        TreeNode node = new BinNode(e);
        node.setChildren(new ArrayList());
        node.setParent(n);
        n.getChildren().set(i,node);
        return node;
    }

    //노드 n의 자식리스트에서 i번째 child 삭제
    public TreeNode removeChild(TreeNode n, int i){
        this.TreeSize--;
        return (TreeNode) n.getChildren().remove(i);
    }
}