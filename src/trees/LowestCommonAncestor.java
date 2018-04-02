package trees;
import java.util.*;
public class LowestCommonAncestor {
    Node root;

    public static void main(String[] args) {
        LowestCommonAncestor tree_level = new LowestCommonAncestor();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
        Node lca = tree_level.find(tree_level.root, 3, 4);
        System.out.println("LCA is " + lca.key);
    }

    Node find(Node root, int n1, int n2) {
        if (root == null)
            return null;

        if (root.key == n1 || root.key == n2)
            return root;

        Node l = find(root.left, n1, n2);
        Node r = find(root.right, n1, n2);

        if (l != null && r != null) {
            return root;
        } else if (l == null && r == null) {
            return null;
        } else {
            return l == null ? r : l;
        }
    }

}