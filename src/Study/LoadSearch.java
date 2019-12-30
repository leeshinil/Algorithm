package Study;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LoadSearch {
    public static void main(String[] args) {
        int[][] nodeinfo = {{5, 3}, {11, 5}, {13, 3}, {3, 5}, {6, 1}, {1, 3}, {8, 6}, {7, 2}, {2, 2}};
        solution(nodeinfo);

    }

    static class Node {
        Node(int id, int x, int y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }

        int id;
        int x, y;
        Node left;
        Node rignt;
    }

    static int idx;
    static List<Node> nodes = new ArrayList<Node>();

    static Comparator<Node> Comp = new Comparator<Node>() {

        public int compare(Node a, Node b) {
            if (a.y == b.y)
                return a.x - b.x;

            return b.y - a.y;

        }
    };

    static void addNode(Node parent, Node child) {
        if (child.x < parent.x) {
            if (parent.left == null) {
                parent.left = child;
            } else {
                addNode(parent.left, child);
            }
        } else {
            if (parent.rignt == null) {
                parent.rignt = child;
            } else {
                addNode(parent.rignt, child);
            }
        }
    }

    static void preorder(int[][] answer, Node node) {
        if (node == null) return;

        answer[0][idx++] = node.id;
        preorder(answer, node.left);
        preorder(answer, node.rignt);

    }

    static void postorder(int[][] answer, Node node) {
        if (node == null) return;

        postorder(answer, node.left);
        postorder(answer, node.rignt);
        answer[1][idx++] = node.id;
    }

    public static int[][] solution(int[][] nodeinfo) {
        int size = nodeinfo.length;

        for (int i = 0; i < size; i++) {
            nodes.add(new Node(i+1, nodeinfo[i][0], nodeinfo[i][1]));
        }
        nodes.sort(Comp);//sort

        Node root = nodes.get(0);
        for (int i = 1; i < size; i++) {
            addNode(root, nodes.get(i));
        }


        int answer[][] = new int[2][size];
        preorder(answer, root);
        idx = 0;
        postorder(answer, root);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.println(answer[i][j]);
            }
        }
        return answer;
    }


}