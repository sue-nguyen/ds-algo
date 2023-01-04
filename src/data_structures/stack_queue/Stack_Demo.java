package data_structures.stack_queue;

public class Stack_Demo {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        System.out.println("Is stack empty? " + s.isEmpty());
        s.print();
        System.out.println("Peek: " + s.peek());

        s.push('h');
        s.print();
        System.out.println("Peek: " + s.peek());

        s.push('e');
        s.print();
        System.out.println("Peek: " + s.peek());

        s.push('l');
        s.print();
        System.out.println("Peek: " + s.peek());

        s.push('l');
        s.print();
        System.out.println("Peek: " + s.peek());

        System.out.println("Is stack empty? " + s.isEmpty());

        s.push('o');
        s.print();
        System.out.println("Peek: " + s.peek());

        System.out.println("Pop: " + s.pop());
        s.print();

        s.push(' ');
        s.print();
        System.out.println("Peek: " + s.peek());

        s.push('i');
        s.print();
        System.out.println("Peek: " + s.peek());

        s.push('s');
        s.print();
        System.out.println("Peek: " + s.peek());

        s.push(' ');
        s.print();
        System.out.println("Peek: " + s.peek());

        s.push('f');
        s.print();
        System.out.println("Peek: " + s.peek());

        s.push('u');
        s.print();
        System.out.println("Peek: " + s.peek());

        s.push('n');
        s.print();
        System.out.println("Peek: " + s.peek());

        System.out.println("Pop: " + s.pop());
        s.print();

        System.out.println("Pop: " + s.pop());
        s.print();

        System.out.println("Pop: " + s.pop());
        s.print();

        System.out.println("Pop: " + s.pop());
        s.print();
    }
}
