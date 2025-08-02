public class AssignmentTask6 {

    // SUBMIT ONLY THIS METHOD
    public static void pairJoin(DNode dh1, DNode dh2) {
        DNode current = dh1.next;
        DNode temp = dh2.next;
        
  
        if (current == null || temp == null || current == dh1 || temp == dh2) {
            return;
        }
        
        while (current != dh1 && temp != dh2) {
            DNode after = current.next;
            DNode nextTemp = temp != null ? temp.next : null;
            
            current.next = temp;
            temp.prev = current;
            temp.next = after;
            if (after != null) {
                after.prev = temp;
            }

            current = after;
            temp = nextTemp;
            

            if (current == null || temp == null || current == dh1 || temp == dh2) {
                break;
            }
        }
        
  
        DNode lastNode = dh1.next;
        while (lastNode != null && lastNode.next != null && lastNode.next != dh1) {
            lastNode = lastNode.next;
        }
        if (lastNode != null) {
            lastNode.next = dh1;
            dh1.prev = lastNode;
        }
        
        return;
    }

    // DO NOT SUBMIT THE DRIVER CODE BELOW
    // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = { "A", "B", "C", "D" };
        Object[] list2 = { "E", "F", "G", "H" };

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = { "A", "E", "B", "F", "C", "G", "D", "H" };
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        // Running the Pair Join
        pairJoin(dh1, dh2);
        // Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
