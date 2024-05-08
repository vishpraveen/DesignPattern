package dsa.tree;

public class DiameterOfTreeNew {
    int ans = 0;

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(4);
        root.left.right = new Node(3);

        root.left.left.left = new Node(2);

        DiameterOfTreeNew dt = new DiameterOfTreeNew();

        System.out.println("Height: " + dt.height(root));

        System.out.println("Diameter: " + dt.ans);
    }

    int height(Node node) {
        if (node == null) return 0;

        int lh = height(node.left);
        int rh = height(node.right);

        int currHeight = (1 + lh + rh);
        ans = Math.max(ans, currHeight);
        return currHeight;
    }
}
