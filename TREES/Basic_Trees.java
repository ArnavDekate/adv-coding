import java.util.ArrayList;

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

        // sum of values
        int x = sum(node);
        System.out.println(x);

        // no. of nodes
        int c = count(node);
        System.out.println(c);

        // Max value
        int m = max(node);
        System.out.println(m);

        // Heigth of tree
        int h = height(node);
        System.out.println(h);

        // Pre In Post
        func(node);

        // Print left -> root <- right
        print(node);

        // Store preorder traversal in arraylist
        ArrayList<Integer> al_pre = new ArrayList<>();
        ArrayList<Integer> al_in = new ArrayList<>();
        ArrayList<Integer> al_post = new ArrayList<>();
        store(node, al_pre, al_in, al_post);
        System.out.println("Preorder  : " + al_pre);
        System.out.println("Inorder   : " + al_in);
        System.out.println("Postorder : " + al_post);

        // find
        boolean n = find(node, 4);
        System.out.println(n);

        // find path
        ArrayList<Integer> al = new ArrayList<>();
        find_path(node, 9, al);
        System.out.println(al);
    }

    static int sum(Node node) {

        if (node.left == null && node.right == null) {
            return node.val;
        }

        int sum = 0;

        if (node.left == null) {
            sum += sum(node.right) + node.val;
        } else if (node.right == null) {
            sum += sum(node.left) + node.val;
        } else {
            sum += sum(node.left) + sum(node.right) + node.val;
        }

        return sum;
    }

    static int count(Node node) {

        if (node.left == null && node.right == null) {
            return 1;
        }

        int count = 0;

        if (node.left == null) {
            count += count(node.right) + 1;
        } else if (node.right == null) {
            count += count(node.left) + 1;
        } else {
            count += count(node.left) + count(node.right) + 1;
        }

        return count;
    }

    static int max(Node node) {

        if (node.left == null && node.right == null) {
            return node.val;
        }

        int max = node.val;

        if (node.left == null) {
            max = Math.max(max(node.right), max);
        } else if (node.right == null) {
            max = Math.max(max(node.left), max);
        } else {
            max = Math.max(Math.max(max(node.left), max(node.right)), max);
        }

        return max;
    }

    static int height(Node node) {
        if (node.left == null && node.right == null) {
            return 1;
        }

        int h = 0;

        if (node.left == null) {
            h += height(node.right) + 1;
        } else if (node.right == null) {
            h += height(node.left) + 1;
        } else {
            h += Math.max(height(node.left), height(node.right)) + 1;
        }

        return h;
    }

    static void func(Node node) {
        if (node == null) {
            return;
        }

        System.out.println("Pre  : " + node.val);
        func(node.left);
        System.out.println("In   : " + node.val);
        func(node.right);
        System.out.println("Post : " + node.val);

        return;
    }

    static void print(Node node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.println("null -> " + node.val + " <- null");
        } else if (node.left == null) {
            System.out.println("null -> " + node.val + " <-    " + node.right.val);
        } else if (node.right == null) {
            System.out.println(node.left.val + "    -> " + node.val + " <- null");
        } else {
            System.out.println(node.left.val + "    -> " + node.val + " <-    " + node.right.val);
        }

        print(node.left);
        print(node.right);

    }

    static void store(Node node, ArrayList<Integer> al1, ArrayList<Integer> al2, ArrayList<Integer> al3) {

        if (node == null) {
            return;
        }

        al1.add(node.val);
        store(node.left, al1, al2, al3);
        al2.add(node.val);
        store(node.right, al1, al2, al3);
        al3.add(node.val);
        return;

    }

    public static boolean find(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }

        boolean flag1 = find(root.left, val);
        if (flag1 == true) {
            return true;
        }
        boolean flag2 = find(root.right, val);
        if (flag2 == true) {
            return true;
        }

        return false;
    }

    public static boolean find_path(Node root, int val, ArrayList<Integer> al) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            al.add(root.val);
            return true;
        }

        boolean flag1 = find_path(root.left, val, al);
        if (flag1 == true) {
            al.add(root.val);
            return true;
        }
        boolean flag2 = find_path(root.right, val, al);
        if (flag2 == true) {
            al.add(root.val);
            return true;
        }

        return false;

    }
}