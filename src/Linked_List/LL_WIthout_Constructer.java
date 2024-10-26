package Linked_List;

public class LL_WIthout_Constructer {
    Node head;

    class Node{
        int value;
        Node next=null;

        public Node(int value)
        {
            this.value=value;
            this.next=next;
        }
    }

    public void createLL(int value)
    {
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }

    public void addNodeEnd(int value)
    {
        Node newNode=new Node(value);
        Node temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void print_list()
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public void removeLastNode()
    {
        Node firstpoint=head.next;
        Node secondpoint=head;
        while(firstpoint.next!=null)
        {
            firstpoint=firstpoint.next;
            secondpoint=secondpoint.next;
        }
        secondpoint.next=null;
    }

    public void removeFirstNode()
    {
        head=head.next;
    }

    public static void main(String[] args) {

        LL_WIthout_Constructer linkedlist=new LL_WIthout_Constructer();
        linkedlist.createLL(5);
        linkedlist.createLL(6);

        linkedlist.addNodeEnd(10);

        linkedlist.print_list();

        linkedlist.removeLastNode();
        linkedlist.print_list();

        linkedlist.removeFirstNode();
        linkedlist.print_list();

    }
}
