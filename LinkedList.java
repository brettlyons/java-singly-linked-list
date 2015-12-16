
class LinkedList
{
  class Node {
    private Object data;
    public Node next;

    void Node(Object data, Node next) {
      this.data = data; 
      this.next = next;
    }
    public static Object getData() {
      return data;
    }
  }

  private Node head;
  private Node last;

  void LinkedList (Object newData) {
    this.head = new Node(newData, null);
  }

  void LinkedList() {
    this(null);
  }

  
  public static void add-to-front(Object newData) {
    
  }

  public static void add-to-tail(Object newData) {
    
  }

  public static Object remove-head() {
    theDataObject = this.head.getData();
    this.head = this.head.next; 
    return theDataObject;
  }

  public static void main(String args[])
  {

  }
}
