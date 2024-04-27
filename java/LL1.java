class LL1 {
    Node head;
    private int size;
    LL1(){
        size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add
    //first
    public void AddF(String data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;  
    }
    // last
    public void AddL(String data) {
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        Node Currnode = head;
        while(Currnode.next != null );{
        Currnode = Currnode.next;
        }
        Currnode.next = newNode;
    }
    //print 
    public void printList() {
        
        Node Currnode = head;
        while(Currnode.next != null );{
            System.out.print(Currnode.data+"->");
        Currnode = Currnode.next;
        }
       System.out.println("null");
        
    }
    public void removeF() {
        if( head == null){
            System.out.println("list is empty");
        }
        head = this.head.next;
        size--; 
    }
    public void removeL() {
        if (head == null){
            System.out.println(" empty list  n to delet");
            return;
        }
        size--;
        if(head.next == null){
            head = null ;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            currNode =currNode.next;
            lastNode = lastNode.next;

        }
            currNode.next =null;
    }
    public int  getSize() {
        return size; 
    }
    public static void main(String[] args) {

        LL1 list = new LL1();
        list.AddL("jaina");
        list.AddL("BHarvad");
        list.AddL("MaheshBhai");
        list.printList();

        list.AddF("Saraiya");
        list.printList();

        System.out.println(list.getSize());

        list.removeF();
        list.printList();;

        list.removeL();
        list.printList();
    }
}