package com.code_signal.interview_practice.linked_lists;
// Definition for singly-linked list:
//class ListNode<T> {
//    ListNode(T x) {
//        value = x;
//    }
//
//    T value;
//    ListNode<T> next;
//}
class RemoveKFromList {
    ListNode<Integer> solution(ListNode<Integer> l, int k) {
        if (l == null)
            return l;

        l.next = solution(l.next, k);
        if (l.value == k)
            return l.next;

        return l;
    }
}
