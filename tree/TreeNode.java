package tree;

import java.util.ArrayList;

//노드에는 element, parent node, list of child 정보가 들어있다
public class TreeNode {
    private Object element;
    private TreeNode parent;
    private ArrayList children;

    public int level;

    public TreeNode(){
        this.element = null;
        this. parent = null;
        this.children = null;
    }

    //tree1의 생성자에서 호출, 하나의 노드를 만든다.
    public TreeNode(Object e){
        this.element = e;
        this.parent = null;
        //this.children = new ArrayList();
        this.children = null;
        //이건 이진트리일때
        //child.add(null);
        //child.add(null);
    }
    public Object getElement(){
        return this.element;
    }
    public TreeNode getParent(){
        return this.parent;
    }
    public ArrayList getChildren(){
        return this.children;
    }
    public int degree(){
        return this.children.size();
    }
    public void setElement(Object e){
        this.element = e;
    }
    public void setParent(TreeNode p){
        this.parent = p;
    }
    public void setChildren(ArrayList c){
        this.children = c;
    }
}


