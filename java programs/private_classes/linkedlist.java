package private_classes;

public class linkedlist {
    private int size;
    private node head;

    private class node {
        private int data;
        private node next;

        public node(int d) {
            data = d;
            next = null;
        }
    }

    public void add(int d) {
        node newnode = new node(d);
        if (head == null) {
            head = newnode;
            size++;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        size++;
    }
}
