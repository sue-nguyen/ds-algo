package data_structures.tree;

/**
 * A demo for the binary search tree.
 */
public class BST_Demo {
    public static void main(String[] args) {

        /*
        BINARY SEARCH TREE OF COUNTRIES:
                                    Mongolia
                        /                         \
                   Denmark                         Vietnam
                  /        \                     /         \
              China       England            Thailand      Yemen
            /      \           \           /                /
        Canada   Congo        France    Russia          Venezuela
         */

        BinarySearchTree<String> countries = new BinarySearchTree<>();
        countries.add("Mongolia");
        countries.add("Denmark");
        countries.add("China");
        countries.add("Vietnam");
        countries.add("Thailand");
        countries.add("Yemen");
        countries.add("Russia");
        countries.add("Canada");
        countries.add("Congo");
        countries.add("England");
        countries.add("France");
        countries.add("Venezuela");
        countries.retrieve();
    }
}
