package data_structures.list;

public class AL_Demo {
    public static void main(String[] args) {
        // TEST EMPTY LIST
        ArrayList scores = new ArrayList();
        scores.retrieve();

        // ADD ELEMENTS TO THE LIST
        scores.add(97.0);
        scores.add(98.0);
        scores.add(97.8);
        scores.add(93.3);
        scores.add(81.4);
        scores.add(75.0);
        scores.retrieve();

        // INSERT ELEMENTS INTO INDEX
        scores.add(3, 85.0);
        scores.retrieve();
        scores.add(4, 76.6);
        scores.retrieve();
        scores.add(2, 82.1);
        scores.retrieve();

        // TEST ADD MORE THAN 10 ELEMENTS TO THE INITIALLY EMPTY LIST
        scores.add(100.0);
        scores.add(100.0);
        scores.add(76.6);
        scores.add(93.3);
        scores.add(97.5);
        scores.add(87.0);
        scores.add(87.0);
        scores.retrieve();

        // REMOVE AT INDICES
        scores.remove(0);
        scores.remove(14);
        scores.remove(16);
        scores.remove(3);
        scores.remove(9);
    }
}
