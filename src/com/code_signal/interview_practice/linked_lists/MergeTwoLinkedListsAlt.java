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

private ListNode<Integer> merged=new ListNode<Integer>(null);
public class MergeTwoLinkedListsAlt {
    ListNode<Integer> solution(ListNode<Integer> l1, ListNode<Integer> l2) {

        if (head1 ==null && head2==null)
            return null;

        ListNode<Integer> travList1=head1;
        ListNode<Integer> travList2=head2;
        // ListNode<Integer> travMerged=mergedHead;
        int listSize=getSize(head1);
        System.out.println("size: "+listSize);
//     while(travList1 != null || travList2 !=null){
//       //   travMerged=travList1.value;

//    //    System.out.println("l1: "+(int)travList1.value+" | l2: "+(int)travList2.value+" | m: "+(int)travMerged.value);
//         System.out.println("l1: "+(int)travList1.value+" | l2: "+(int)travList2.value);


//         travList1=travList1.next;
//         travList2=travList2.next;
//     }

        return merged;

    }

    public int getSize(ListNode<Integer> list){
        int numElements=0;
        ListNode<Integer> trav=list;
        while(list !=null){

            numElements++;
            trav=trav.next;
        }

        return numElements;
    }