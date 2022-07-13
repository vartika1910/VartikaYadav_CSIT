import java.util.*;

public class circularLinkedList {
    ListNode head;

    class ListNode {
        int data;
        ListNode next;

        ListNode(int new_data) {
            this.data = new_data;
            this.next = this;
        }
    }

    public int ListLength() {
        if(head==null)
            return 0;
        int length = 1;
        ListNode curr = head.next;
        while(curr!=head)
        {
            length++;
            curr = curr.next;
        }
        return length;
    }

    public void InserDataAtBeginning(int new_data) {
        ListNode temp = new ListNode(new_data);
        temp.next = head;
        ListNode curr = head;
        while(curr.next!=head)
            curr=curr.next;
        curr.next = temp;
        head = temp;
    }

    public void InserDataAtEnding(int new_data) {
        ListNode temp = new ListNode(new_data);
        temp.next = head;
        ListNode curr = head;
        while(curr.next!=head)
            curr=curr.next;
        curr.next = temp;
    }

    public void InserDataAtPosition(int new_data, int position) {
        
    }

    public void DeleteDataAtBeginning() {
    }

    public void DeleteDataAtEnding() {
    }

    public void DeleteDataAtPosition(int position) {
    }

    public void DeleteAtEqual(ListNode node) {
    }

    public int getPosition(int data) {
    }

    public void displayLinkedList() {
    }

    public void DeleteAllData() {
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        singlyLinkedList ob = new singlyLinkedList();
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
