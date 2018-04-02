package trees;

public class Node{
    int key;
    Node left,right,sibling;

    Node(int val){
        key = val;
        left = right = sibling = null;
    }
}