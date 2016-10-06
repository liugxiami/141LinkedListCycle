package com.ccsi;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListNode head=buildList();
        System.out.println(hasCycle(head));
    }
    //Given a linked list,determine if it has a cycle in it
    public static boolean hasCycle(ListNode head){           //快慢指针
        if(head==null||head.next==null)return false;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }
    
    public static ListNode buildList(){
        ListNode root=new ListNode(1);
        root.next=new ListNode(2);
        root.next.next=new ListNode(3);
        root.next.next.next=new ListNode(4);
        root.next.next.next.next=new ListNode(5);
        root.next.next.next.next.next=root;
        return root;
    }

}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

