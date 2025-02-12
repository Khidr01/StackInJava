class Stack {

    // Constructor of Stack
    public Stack() {
        System.out.println("Stack is created");
    }

    // This class is created to create nodes from it
    private static class Node {

        // Used to hold the value passed to the node
        private int value;
        public Node next;

        // Constructor of Node
        public Node(int x) {
           this.value = x;
        }

        public int getValue() {
            return this.value;
        }
    }

    Node head = null;
    Node firstPtr = null;

    public void addNode(Node obj) {
        /* This is for debugging purposes
        if(head == null) {
            head = obj;
            firstPtr = obj;
            System.out.println("Value in Head: " + head.getValue());
            System.out.println("Value in Obj: " + obj.getValue());
            System.out.println("Address of Head: " + head);
            System.out.println("Address of Obj: " + obj);

            System.out.println();
        } else {
            System.out.println("------------------------------");

            System.out.println("Value in Head: " + head.getValue());
            System.out.println("Address of Head: " + head);
            System.out.println("Head.next: " + head.next);

            System.out.println();
            head.next = obj;

            System.out.println("\tHead.next: " + head.next);

            head = obj;

            System.out.println("Value in obj: " + obj.getValue());
            System.out.println("Address of Obj: " + obj);

            System.out.println();

            System.out.println("Value in Head: " + head.getValue());
            System.out.println("Address of Head: " + head);
            System.out.println("Head.next: " + head.next);


            System.out.println("------------------------------");

            System.out.println();
        } */
        if(head == null) {
            head = obj;
            firstPtr = obj;
        } else {
            head.next = obj;
            head = obj;
        }
    }

    public void popup() {
        // Ite == iterator
        Node ite = firstPtr;
        while(ite.next != head) {
            ite = ite.next;
        }
        head = ite;
        head.next = null;
    }

    public void printElements() {
        System.out.println("\tPrinting elements...");
        Node ite = firstPtr;
        while(ite.next != null) {
            System.out.println(ite.getValue());
            ite = ite.next;
        }
        System.out.println(ite.getValue());
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.addNode(new Node(1));
        stack.addNode(new Node(2));
        stack.addNode(new Node(3));

        stack.popup();
        stack.popup();

        stack.addNode(new Node(4));
        stack.addNode(new Node(5));

        stack.printElements();
    }
}
