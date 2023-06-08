import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("remove: "+queue.remove());
        System.out.println("element: "+queue.element());
        System.out.println("poll: "+queue.poll());
        System.out.println("peek: "+queue.peek());


    }
}