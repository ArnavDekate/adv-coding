import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class construct_tree {

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

    public static class pair {
        Node node;
        int state;

        // Constructer'
        pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {

        Integer[] arr = { 1, 2, 4, null, null, 5, 6, null, null, null, 3, 7, null, 9, null, null, 8, null, null };

        Node root = construct(arr);

        boolean x = find(root, 4);
        System.out.println(x);

        // find path
        ArrayList<Integer> al = new ArrayList<>();
        find_path(root, 9, al);
        System.out.println(al);

        // print level
        print_level(root, 2);

        // level order traversal
        Queue<Integer> q = new ArrayDeque<>();

    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);

        Stack<pair> st = new Stack<>();

        pair p = new pair(root, 0);
        st.push(p);

        int idx = 1;
        while (st.size() > 0) {
            pair obj = st.peek();

            if (obj.state == 0) {
                if (arr[idx] == null) {
                    idx++;
                    obj.state++;
                } else {
                    Node temp = new Node(arr[idx], null, null);
                    obj.node.left = temp;
                    idx++;
                    obj.state++;
                    st.push(new pair(temp, 0));
                }
            } else if (obj.state == 1) {
                if (arr[idx] == null) {
                    idx++;
                    obj.state++;
                } else {
                    Node temp = new Node(arr[idx], null, null);
                    obj.node.right = temp;
                    idx++;
                    obj.state++;
                    st.push(new pair(temp, 0));
                }

            } else {
                st.pop();
            }
        }

        return root;
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

    public static void print_level(Node root, int level) {
        if (root == null) {
            return;
        }

        if (level == 0) {
            System.out.println(root.val);
            return;
        }

        print_level(root.left, level - 1);
        print_level(root.right, level - 1);

        return;
    }
}
