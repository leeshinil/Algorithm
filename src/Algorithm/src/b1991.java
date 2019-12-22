import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1991 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        char data[];
        Tree tree = new Tree();
        for(int i = 0; i < n; i++) {
            data = in.readLine().replace(" ", "").toCharArray();
            tree.add(data[0],data[1],data[2]);
        }
        tree.preoder(tree.root);
        System.out.println();
        tree.inoder(tree.root);
        System.out.println();
        tree.postoder(tree.root);
        System.out.println();
    }

    static class Node {
        char data;
        Node left, right;

        public Node(char data) {
            this.data = data;
        }
    }

    static class Tree {
        Node root;

        public void add(char data, char leftData, char rightData) {
            if (root == null) {
                if (data != '.') {
                    root = new Node(data);
                }
                if(leftData != '.') { root.left = new Node(leftData); }
                if(rightData != '.') { root.right = new Node(rightData); }
            } else {
                search(root, data, leftData, rightData);
            }
        }

        public void search(Node root,char data, char leftData, char rightData) {
            if(root == null) return;
            else if(root.data == data){
                if(leftData != '.') { root.left = new Node(leftData); }
                if(rightData != '.') { root.right = new Node(rightData); }
            }
            else {
                search(root.left, data, leftData, rightData);
                search(root.right, data, leftData, rightData);
            }
        }

        public void preoder(Node root) {
            System.out.print(root.data);
            if(root.left != null) {preoder(root.left);}
            if(root.right != null) {preoder(root.right);}
        }
        public void inoder(Node root) {
            if(root.left != null) {inoder(root.left); }
            System.out.print(root.data);
            if(root.right != null) { inoder(root.right); }
        }
        public void postoder(Node root) {
            if(root.left != null) {postoder(root.left); }
            if(root.right != null) { postoder(root.right); }
            System.out.print(root.data);
        }
    }
}
