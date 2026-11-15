class Solution {
    int rem;
    ListNode temp;
    public int checkLength(ListNode l1) {
        int len = 0;
        while (l1.next != null) {
            len++;
            l1 = l1.next;
        }
        return len;
    }
    public void addZero(ListNode l1, int len) {
        while (l1.next != null) {
            l1 = l1.next;
        }
        while (len > 0) {
            l1.next = new ListNode(0);
            l1 = l1.next;
            len--;
        }
    }
    public void add(ListNode h1, ListNode h2) {
        if (h1 == null && h2 == null) {
            return;
        }

        int val = h1.val + h2.val + rem;
        if (val <= 9) {
            h1.val = val;
            rem = 0;
        } else {
            rem = val / 10;
            h1.val = val % 10;
        }
        if (h1.next == null) {
            temp = h1;
        }
        add(h1.next, h2.next);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        rem = 0;
        int a = checkLength(l1);
        int b = checkLength(l2);
        if (a > b) {
            addZero(l2, a - b);
        } else if (b > a) {
            addZero(l1, b - a);
        }
        ListNode h1 = l1;
        ListNode h2 = l2;
        add(l1, l2);
        if (rem != 0) {
            temp.next = new ListNode(rem);
        }
        return l1;
    }
}
