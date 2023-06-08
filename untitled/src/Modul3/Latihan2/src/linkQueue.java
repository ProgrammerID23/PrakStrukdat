public class linkQueue {
    public FirstLastList thelist;

    public linkQueue(){
        thelist = new FirstLastList();
    }

    public boolean isEmpty(){
        return thelist.isEmpty();
    }

    public void enqueue(String j){
        thelist.insertLast(j);
    }

    public void dequeue(){
        thelist.deletefirst();
    }

    public void displayQueue(){
        System.out.print("Queue (Head-->Tail) : ");
        thelist.displayList();
    }
}
