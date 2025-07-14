import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {
    Node head;

    void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if(head != null) head.prev = newNode;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAtPosition(int data, int pos) {
        if(pos == 1) {
            insertAtBegin(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if(temp == null || temp.next == null) {
            insertAtEnd(data);
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    void deleteAtBegin() {
        if(head == null) return;
        head = head.next;
        if(head != null) head.prev = null;
    }

    void deleteAtEnd() {
        if(head == null) return;
        if(head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.prev.next = null;
    }

    void deleteAtPosition(int pos) {
        if(pos == 1) {
            deleteAtBegin();
            return;
        }
        Node temp = head;
        for(int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }
        if(temp == null) return;
        if(temp.next != null) temp.next.prev = temp.prev;
        if(temp.prev != null) temp.prev.next = temp.next;
    }

    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(10);
        dll.insertAtBegin(5);
        dll.insertAtEnd(15);
        dll.insertAtPosition(12, 3);
        dll.display();
        dll.deleteAtBegin();
        dll.display();
        dll.deleteAtEnd();
        dll.display();
        dll.deleteAtPosition(2);
        dll.display();
        sc.close();
    }
}
