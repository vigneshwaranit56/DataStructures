package learning.patterns.fast_slow_pointers;

import learning.linear.linkedlist.LinkdedList;
import learning.linear.linkedlist.SinglelyLinkList;
import learning.linear.list.singlylinklist.Node;

public class DetectCycleInLinkedList {
    public static void main(String[] args){
        LinkdedList list = new SinglelyLinkList();
        list.add(6);
        list.add(3);
        list.add(4);

        list.add(2);
        list.add(7);
        list.add(9);
        list.add(8);
        list.add(5);
        list.add(6);

    }
}
