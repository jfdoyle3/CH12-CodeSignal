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


public class MergeTwoLinkedLists {
    ListNode<Integer> solution(ListNode<Integer> l1, ListNode<Integer> l2) {

        ListNode<Integer> mergedList = new ListNode(l1.value);
        System.out.println("m: " + mergedList.value);

        mergedList = mergedList.next;

        if (l1 == null && l2 == null)
            return mergedList;

        System.out.println("l1: " + l1.value);
        System.out.println("l2: " + l2.value);
        System.out.println();


        if (l1 != null && l2 != null) {
            l1 = l1.next;
            l2 = l2.next;
            solution(l1, l2);
        }


        return null;

    }
}