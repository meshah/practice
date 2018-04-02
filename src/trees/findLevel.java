package trees;

public class findLevel {

    Node root;
    public static void main(String [] args){
        findLevel tree_level = new findLevel();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        int res = tree_level.find(tree_level.root,3,1);
        System.out.println(res);
    }

    int find(Node root,int n,int level){
        int l = 0;
        if(root==null)
            return 0;

        if(root.key==n)
            return level;

        l = find(root.left,n,level+1);
        if(l!=0)
            return l;

        l = find(root.right,n,level+1);
        if(l!=0)
            return l;

        return 0;
    }
}
