package Linked_List;

public class Create_SLL {
    private Node head;
    private Node tail;
    int length;

    class Node{
        int value;
        Node next;

        public Node(int value)
        {
            this.value=value;
        }
    }

    public Create_SLL(int value){
    Node newNode=new Node(value);
    head=newNode;
    tail=newNode;
    length=1;
    }

    public void print_list()
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.println("Temp : "+temp.value);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {

        LL_WIthout_Constructer linkedlist=new LL_WIthout_Constructer();
        linkedlist.print_list();

        System.out.println("END");
    }
}
