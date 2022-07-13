package DSA.LinkedList;

import java.util.*;

class doublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int new_data) {
            this.data = new_data;
            prev = null;
            next = null;
        }
    }

    public int ListLength() {
        if (head == null)
            return 0;
        Node curr = head;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        return length;
    }

    public void InserDataAtBeginning(int new_data) {
        Node curr = new Node(new_data);
        if (head == null) {
            head = curr;
        } else {
            curr.next = head;
            head.prev = curr;
            head = curr;
        }
    }

    public void InserDataAtEnding(int new_data) {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        Node temp = new Node(new_data);
        temp.prev = curr;
        curr.next = temp;
    }

    public void InserDataAtPosition(int new_data, int position) {
        if (head == null && position != 1) {
            System.out.println("LinkedList Empty! Adding Element in the beginning...");
            InserDataAtBeginning(new_data);
        } else if (position == 1) {
            InserDataAtBeginning(new_data);
        } else if (position > ListLength()) {
            System.out.println("LinkedList length is shorter than the position! Adding Element in the ending...");
            InserDataAtEnding(new_data);
        } else {
            int k = 0;
            Node curr = head;
            while (k != position) {
                k++;
                curr = curr.next;
            }
            Node temp = new Node(new_data);
            temp.next = curr.next;
            curr.next = temp;
        }
    }

    public void DeleteDataAtBeginning() {
        Node temp = head;
        if (temp != null) {
            head = head.next;
            temp.next = null;
        }
    }

    public void DeleteDataAtEnding() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        Node temp = null;
        while (curr.next != null) {
            if (curr.next.next == null) {
                temp = curr;
            }
            curr = curr.next;
        }
        temp.next = null;
    }

    public void DeleteDataAtPosition(int position) {
        if (head == null && position != 1) {
            System.out.println("LinkedList already Empty!");
            return;
        } else if (position == 1) {
            DeleteDataAtBeginning();
        } else if (position >= ListLength()) {
            System.out.println("LinkedList length is shorter than the position! Deleting Element in the ending...");
            DeleteDataAtEnding();
        } else {
            int k = 0;
            Node curr = head;
            while (k != position - 1) {
                k++;
                curr = curr.next;
            }
            Node temp = curr.next;
            curr.next = curr.next.next;
            temp.next = null;
        }
    }

    public void DeleteAtEqual(Node node) {
        if (head == null)
            return;
        if (node.equals(head)) {
            head = head.next;
            return;
        }
        Node curr = head;
        Node temp = curr;
        while (temp.next != null) {
            if (temp.equals(node)) {
                curr.next = temp.next;
                return;
            }
            curr = temp;
            temp = temp.next;
        }
    }

    public int getPosition(int data) {
        Node curr = head;
        int position = 0;
        while (curr != null) {
            position++;
            if (curr.data == data) {
                return position;
            }
            curr = curr.next;
        }
        if (position >= ListLength()) {
            return -1;
        }
        return Integer.MIN_VALUE;
    }

    public void displayLinkedList() {
        System.out.print("[");
        if (head == null) {
            System.out.print("]");
            System.out.println();
            return;
        }
        System.out.print(head.data);
        Node curr = head.next;
        while (curr != null) {
            System.out.print("," + curr.data);
            curr = curr.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public void DeleteAllData() {
        head = null;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        doublyLinkedList ob = new doublyLinkedList();
        int choice = 0;
        while (choice != 5) {
            System.out.println(
                    "Enter 10 to insert element at beginning\nEnter 11 to insert element at ending\nEnter 12 to insert element at any position\nEnter 20 to delete element at beginning\nEnter 21 to delete element at ending\nEnter 22 to delete element at any position\nEnter 3 to display linked list\nEnter 4 to delete linked list\nEnter 5 to exit");
            choice = sc.nextInt();
            int x, pos;
            switch (choice) {
                case 10:
                    System.out.println("Enter elemnet to be inserted at beginning");
                    x = sc.nextInt();
                    ob.InserDataAtBeginning(x);
                    ob.displayLinkedList();
                    break;
                case 11:
                    System.out.println("Enter elemnet to be inserted at ending");
                    x = sc.nextInt();
                    ob.InserDataAtEnding(x);
                    ob.displayLinkedList();
                    break;
                case 12:
                    System.out.println("Enter position");
                    pos = sc.nextInt();
                    System.out.println("Enter elemnet to be inserted");
                    x = sc.nextInt();
                    ob.InserDataAtPosition(x, pos);
                    ob.displayLinkedList();
                    break;
                case 20:
                    ob.DeleteDataAtBeginning();
                    ob.displayLinkedList();
                    break;
                case 21:
                    ob.DeleteDataAtEnding();
                    ob.displayLinkedList();
                    break;
                case 22:
                    System.out.println("Enter position");
                    pos = sc.nextInt();
                    ob.DeleteDataAtPosition(pos);
                    ob.displayLinkedList();
                    break;
                case 3:
                    ob.displayLinkedList();
                    break;
                case 4:
                    ob.DeleteAllData();
                    ob.displayLinkedList();
                    break;
                case 5:
                    choice = 5;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
        sc.close();
    }

}
