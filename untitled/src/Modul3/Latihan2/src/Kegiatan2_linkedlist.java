public class Kegiatan2_linkedlist {
    public static void main(String[] args){
        linkQueue queue = new linkQueue();

        queue.enqueue("Java");
        queue.enqueue("Dotnet");
        queue.enqueue("PHP");
        queue.enqueue("HTML");

        queue.dequeue();
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();

    }
}
