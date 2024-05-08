package dsa.tree;

import dsa.printer.Printable;

public class Node implements Printable<Node> {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }

    @Override
    public void printNode(Node node) {
        if (node == null) {
            System.out.print("NULL -> ");
            return;
        }

        printNode(node.left);
        System.out.print(node.val + " -> ");
        printNode(node.right);
    }
}
