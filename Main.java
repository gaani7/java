package c1230088;

public class Main {
    public static void main(String[] args) {
        CharStack<Character> stack1 = new CharStack<>(2);
        stack1.push('A');
        stack1.push('B');
        stack1.push('C');
        stack1.display();

        System.out.println("===================");
        Character removedElement = stack1.pop();
        System.out.println("Element Removed: " + removedElement);
        System.out.println("Top element now: " + stack1.peek());
        System.out.println("Current Size: " + stack1.size());
        System.out.println("Is Stack Empty: " + stack1.isEmpty());
    }
}
