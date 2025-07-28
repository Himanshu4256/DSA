package com.learning.circularLinkedList;

import com.learning.SingleLinkedList.InsertionAllPositions;

import java.util.Scanner;

public class InsertAllPositions {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void creation(){
        int data,n,m,p;

        do{
            System.out.println("Enter Data");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            Node newNode = new Node(n);
            if (head == null){
                head = newNode;
                newNode.next = head;
                tail = head;
            }
            else {
                System.out.println("Enter the Position which you want to insert : 1 Beginning : 2 End : 3 At Specific");
                m = sc.nextInt();
                switch (m){
                    case 1:
                        newNode.next = head;
                        head = newNode;
                        tail.next = head;
                        break;

                    case 2:
                        Node temp = head;
                        while (temp != tail){
                            temp = temp.next;
                        }
                        tail.next = newNode;
                        newNode.next = head;
                        tail = newNode;
                        break;
                    case 3:
                        System.out.println("Enter the position for insertion");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p-1); i++) {
                            temp1 = temp1.next;
                        }

                        newNode.next = temp1.next;
                        temp1.next = newNode;
                        break;
                }
            }
            System.out.println("Press 1 if you want more data");
            m = sc.nextInt();
        } while (m == 1);


    }

    void traverse() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }


    public static void main(String[] args) {
        InsertAllPositions CLL = new InsertAllPositions();
        CLL.creation();
        CLL.traverse();
    }
}
