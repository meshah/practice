package trees;

public class LevelOrderTraversal {

    Node root;

    LevelOrderTraversal(){
        root = null;
    }

    LevelOrderTraversal(int val){
        root = new Node(val);
    }

    public static void main(String [] args){
        LevelOrderTraversal lot = new LevelOrderTraversal();
        lot.root = new Node(1);
        lot.root.left = new Node(2);
        lot.root.right = new Node(3);
        lot.root.left.left = new Node(4);
        lot.root.left.right = new Node(5);
        lot.printLevelOrder();
    }

    void printLevelOrder(){
        System.out.println("Level Order Traversal: \n");
        printLevel(root);
    }

    void printLevel(Node root){
        int h = getHeight(root);
        if(h!=0){
            for(int i=1;i<=h;i++){
                printNodes(root,i);
            }
        }
        else
            System.out.println("No tree found!");

    }

    void printNodes(Node root,int level){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.key+" ");
        else{
            printNodes(root.left,level-1);
            printNodes(root.right,level-1);
        }
    }

    int getHeight(Node root){
        if(root==null)
            return 0;
        else{
            int lh = getHeight(root.left);
            int rh = getHeight(root.right);
            if(lh>=rh){
                return lh+1;
            }
            else return rh+1;
        }
    }
}
