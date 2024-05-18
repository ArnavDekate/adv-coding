package TREES;

public class Basic_Trees {

    public static class Node {
        int val;
        Node left;
        Node right;

        // Constructor
        Node(int v, Node l, Node r) {
            this.val = v;
            this.left = l;
            this.right = r;
        }
    }

    public static void main(String[] args) {

        // level 0
        Node node = new Node(1, null, null);

        // level 1
        node.left = new Node(2, null, null);
        node.right = new Node(3, null, null);

        // level 2
        node.left.left = new Node(4, null, null);
        node.left.right = new Node(5, null, null);
        node.right.left = new Node(7, null, null);
        node.right.right = new Node(8, null, null);

        // level 3
        node.left.right.left = new Node(6, null, null);
        node.right.left.right = new Node(9, null, null);

        sum(node);

    }

    static int sum(Node node) {

        if (node.left == null && node.right == null) {
            return node.val;
        }

        int sum = 0;

        sum += sum(node.left) + sum(node.right) + node.val;

        return sum;
    }

}
