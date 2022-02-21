package com.code_signal.interview_practice.linked_lists;

// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//

public class IsListPalindrome {
    boolean solution(ListNode<Integer> head) {
        // HashMap<Integer,Integer> freq=new HashMap<>();
        ListNode<Integer> trav = head;
        int headValue = 0;
        int tailValue = 0;
        //   int counter=0;
        if (head == null)
            return true;

        while (trav != null) {

            if (trav.value == head.value) {
                //    System.out.println("head/trav- start: "+head.value);
                headValue = (int) head.value;
            }
            if (trav.next == null) {
                //     System.out.println("trav - end: "+trav.value);
                tailValue = (int) trav.value;
            }

            // if(!freq.containsKey(trav.value))
            //     freq.put((int)trav.value,0);
            // freq.put((int)trav.value,freq.get((int)trav.value)+1);


            //  counter++;
            trav = trav.next;
        }

        // System.out.println("count: "+counter);
        if (headValue == tailValue) {
            return true;
        }

        return false;
    }
}