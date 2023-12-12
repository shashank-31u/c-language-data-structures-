class ll {
    Node head;
    private int size;


    public class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=null;
    
    }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

        public void addLast(String data){
            Node newNode=new Node(data);
            if(head==null){
                newNode=head;
                return;
            }
            Node LastNode=head;
            while(LastNode.next!=null){
                LastNode=LastNode.next;
            }
            LastNode.next=newNode;
                System.out.println("NULL");
        }
        
    }
    public void deleteFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            System.out.println("The string is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlastNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondlastNode=secondlastNode.next;
        }
        secondlastNode.next=null;
    }
        public void reverseIterate(){
        if(head==null||head.next==null){
            return;
        }
        Node previousNode=head;
        Node currentNode=head.next;
        while(currentNode.next!=null){
            Node nextNode=currentNode.next;
            currentNode.next=previousNode;

            previousNode=currentNode;
            currentNode=nextNode;
        }
        head.next=null;
        head=previousNode;

    }
    public void recurisiveLL(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node NewNode=recurisiveLL(head.next);
        head.next.next=head;
        head.next=null;
        return Node NewNode;
    }

    
    public static void main(String args[]){
        ll list=new ll();
        list.addFirst("this");
        list.addLast("is");
        list.recurisiveLL(list.Node);

    }
}

 
    
}
