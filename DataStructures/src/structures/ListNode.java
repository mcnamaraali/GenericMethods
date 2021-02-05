package structures;

class ListNode<E> {
    E data;
    ListNode<E> nextNode;

    ListNode(E var1) {
        this(var1, (ListNode)null);
    }

    ListNode(E var1, ListNode<E> var2) {
        this.data = var1;
        this.nextNode = var2;
    }

    E getData() {
        return this.data;
    }

    ListNode<E> getNext() {
        return this.nextNode;
    }
}
