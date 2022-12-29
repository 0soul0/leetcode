package linkedlist;

//876. Middle of the Linked List
public class oddEvenLinkedList328 {

    public static void main(String[] args) {

    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }

}