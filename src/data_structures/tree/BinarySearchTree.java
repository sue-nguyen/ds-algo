package data_structures.tree;

/**
 * Implementation of binary search tree.
 * @param <T> The type of data stored in the nodes of the binary search tree.
 */
public class BinarySearchTree<T extends Comparable<? super T>> {

    /**
     * An inner class to represent the node of the binary search tree.
     * @param <T> The type of data stored in the node.
     */
    public static class Node<T> {

        /**
         * Data of the node.
         */
        private final T data;

        /**
         * Left node of the current node.
         */
        private Node<T> left;

        /**
         * Right node of the current node.
         */
        private Node<T> right;

        /**
         * Constructs a node with the specified data.
         * @param data the data of the node
         */
        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        /**
         * Getter method for the data of the node.
         * @return the data of the node
         */
        public T getData() {
            return this.data;
        }

        /**
         * Getter method for the left node of the current node.
         * @return the left node of the current node
         */
        public Node<T> getLeft() {
            return this.left;
        }

        /**
         * Getter method for the right node of the current node.
         * @return the right node of the current node
         */
        public Node<T> getRight() {
            return this.right;
        }

        /**
         * Setter method for the left node of the current node.
         * @param left the left node of the current node
         */
        public void setLeft(Node<T> left) {
            this.left = left;
        }

        /**
         * Setter method for the right node of the current node.
         * @param right the right node of the current node
         */
        public void setRight(Node<T> right) {
            this.right = right;
        }
    }

    /**
     * Size of the binary search tree.
     */
    private int size;

    /**
     * Root node of the binary search tree.
     */
    private Node<T> root;

    /**
     * Left most node of the binary search tree.
     */
    private T leftMost;

    /**
     * Right most node of the binary search tree.
     */
    private T rightMost;

    /**
     * Constructs an empty binary search tree.
     */
    public BinarySearchTree() {
        this.size = 0;
        this.root = null;
    }

    /**
     * Returns the size of the binary search tree.
     * @return the size of the binary search tree
     */
    public int size() {
        return this.size;
    }

    /**
     * Adds the specified node to the binary search tree.
     * @param data node to be added
     */
    public void add(T data) {
        Node<T> node = new Node<>(data);
        Node<T> parent = null;
        Node<T> trav = root;
        while (trav != null) {
            parent = trav;
            if (data.compareTo(trav.getData()) < 0)
                trav = trav.getLeft();
            else
                trav = trav.getRight();
        }
        if (parent == null) {
            root = node;
        }
        else if (data.compareTo(parent.getData()) < 0) {
            parent.setLeft(node);
        }
        else {
            parent.setRight(node);
        }
        // update left most element
        if (leftMost == null)
            leftMost = data;
        else {
            if (leftMost.compareTo(data) > 0)
                leftMost = data;
        }
        // update right most element
        if (rightMost == null)
            rightMost = data;
        else {
            if (rightMost.compareTo(data) < 0)
                rightMost = data;
        }
        size++;
    }

    /**
     * Inorder traversal for the specified node.
     * @param node specified node
     */
    private void inorder(Node<T> node) {
        if (size() < 2)
            System.out.print("[ ]");
        else {
            if (node.getLeft() != null)
                inorder(node.getLeft());
            if (node.getData().equals(leftMost))
                System.out.print("In-Order: [ " + node.getData() + ", ");
            else if (node.getData().equals(rightMost))
                System.out.print(node.getData() + " ]");
            else
                System.out.print(node.getData() + ", ");
            if (node.getRight() != null)
                inorder(node.getRight());
        }
    }

    /**
     * Prints the inorder traversal for the entire binary search tree.
     */
    public void inorder() {
        inorder(root);
    }

    /**
     * Preorder traversal for the specified node.
     * @param node specified node
     */
    private void preorder(Node<T> node) {
        if (size() < 2)
            System.out.print("[ ]");
        else {
            if (node.getData().equals(root.getData()))
                System.out.print("Pre-Order: [ " + node.getData() + ", ");
            else if (node.getData().equals(rightMost))
                System.out.print(node.getData() + " ]");
            else
                System.out.print(node.getData() + ", ");
            if (node.getLeft() != null)
                preorder(node.getLeft());
            if (node.getRight() != null)
                preorder(node.getRight());
        }
    }

    /**
     * Prints the preorder traversal for the entire binary search tree.
     */
    public void preorder() {
        preorder(root);
    }

    /**
     * Postorder traversal for the specified node.
     * @param node specified node
     */
    private void postorder(Node<T> node) {
        if (size() < 2)
            System.out.println("[ ]");
        else {
            if (node.getLeft() != null)
                postorder(node.getLeft());
            if (node.getRight() != null)
                postorder(node.getRight());
            if (node.getData().equals(root.getData()))
                System.out.print(node.getData() + " ]");
            else if (node.getData().equals(leftMost))
                System.out.print("Post-Order: [ " + node.getData() + ", ");
            else
                System.out.print(node.getData() + ", ");
        }
    }

    /**
     * Prints the postorder traversal for the entire binary search tree.
     */
    public void postorder() {
        postorder(root);
    }

    /**
     * Traverses the binary search tree 3 ways: inorder, preorder, and postorder.
     */
    public void retrieve() {
        inorder();
        System.out.println();
        preorder();
        System.out.println();
        postorder();
    }
}
