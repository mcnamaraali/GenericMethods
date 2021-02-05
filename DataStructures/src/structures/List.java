package structures;

import java.util.NoSuchElementException;

public class List<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;

    public List() {
        this("list");
    }

    public List(String var1) {
        this.name = var1;
        this.firstNode = this.lastNode = null;
    }

    public void insertAtFront(E insertItem) {
        if (this.isEmpty()) {
            this.firstNode = this.lastNode = new ListNode(insertItem);
           // System.out.printf(" %s%n", this.lastNode);
        } else {
            this.firstNode = new ListNode(insertItem, this.firstNode);
        }

    }

    public void insertAtBack(E insertItem) {
        if (this.isEmpty()) {
            this.firstNode = this.lastNode = new ListNode(insertItem);
        } else {
            this.lastNode = this.lastNode.nextNode = new ListNode(insertItem);
        }

    }

    public E removeFromFront() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException(this.name + " is empty");
        } else {
            E removedItem = this.firstNode.data;
            if (this.firstNode == this.lastNode) {
                this.firstNode = this.lastNode = null;
            } else {
                this.firstNode = this.firstNode.nextNode;
            }

            return removedItem;
        }
    }

    public E removeFromBack() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException(this.name + " is empty");
        } else {
            E removedItem = this.lastNode.data;
            if (this.firstNode == this.lastNode) {
                this.firstNode = this.lastNode = null;
            } else {
                ListNode <E> current = firstNode; 
              //  for(removedItem = this.firstNode; removedItem.nextNode != this.lastNode; removedItem = removedItem.nextNode) {
              //  }
                while (current.nextNode != lastNode) {
                	current = current.nextNode;
                }
                lastNode = current;
                current.nextNode = null;
            }

            return removedItem;
        }
    }

    public boolean isEmpty() {
        return this.firstNode == null;
    }

    public void print() {
        if (this.isEmpty()) {
            System.out.printf("Empty %s%n", this.name);
        } else {
            System.out.printf("The %s is: ", this.name);

            for(ListNode var1 = this.firstNode; var1 != null; var1 = var1.nextNode) {
                System.out.printf("%s ", var1.data);
            }

            System.out.println();
        }
    }
    
}

