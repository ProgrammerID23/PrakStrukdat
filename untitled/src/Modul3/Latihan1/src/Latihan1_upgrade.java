import java.util.EmptyStackException;
import java.util.LinkedList;

class Node{
    String data;
    Node next;


    public  Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class Stack{
    Node top;
    public Stack(LinkedList list){
        this.top = null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }


    public String pop(){
       if (top == null) {
           throw new EmptyStackException();
       }
       String data = top.data;
       top = top.next;
       return data;
   }

   public String peek(){
        if(top == null){
            throw new EmptyStackException();
        }

        return top.data;
   }

  public boolean isEmpety(){
        return top == null;
  }
    public boolean search(String data) {
        Node currentNode = top;
        int index = 1;

        while (currentNode != null) {
             if (currentNode.data.equals(data)) {
                System.out.println(data + " found at index " + index);
                System.out.println(true);
            }
            currentNode = currentNode.next;
            index++;
        }
        return false;
    }

}



public class Latihan1_upgrade {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Stack st = new Stack(list);
        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println(st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        st.search("Aku");

    }
}
