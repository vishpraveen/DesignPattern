package dsa.tree;

/*
 * Calculate diameter of tree
 * Below approach has a time complexity of O(N^2)
 * */
public class DiameterOfTree {
    Node root = null;

    public static void main(String[] args) {
        DiameterOfTree dt = new DiameterOfTree();

        dt.root = new Node(12);
        dt.root.left = new Node(7);
        dt.root.right = new Node(9);

        dt.root.left.left = new Node(5);
//        dt.root.left.right = new Node(4);
//
//        dt.root.right.left = new Node(3);
//        dt.root.right.right = new Node(2);

        System.out.println("Diameter: " + dt.diameterOfTree(dt.root));

    }

    int diameterOfTree(Node node) {
        if (node == null) return 0;

        int left = diameterOfTree(node.left);
        int right = diameterOfTree(node.right);

        int curr = (height(node.left) + height(node.right)) + 1;

        return Math.max(curr, Math.max(left, right));
    }

    private int height(Node node) {
        if (node == null) return 0;
        int l = height(node.left);
        int r = height(node.right);

        return Math.max(l, r) + 1;
    }
}
