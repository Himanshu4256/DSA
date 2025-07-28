package com.learning.circularLinkedList;

import java.util.Scanner;

public class InsertionTraverser {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void creation(){
        int data,n;

        do{
            System.out.println("Enter Data");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            Node newNode = new Node(n);

            if (head == null){
                head = newNode;
                tail = newNode;
                newNode.next = head;
            }else {
                newNode.next = head;
                head = newNode;
                tail.next = head; // Joining of Tail to Head
            }
            System.out.println("Press 1 if you want to enter more data");
            n = sc.nextInt();
        }while (n==1);

    }

    void traverse(){
        Node temp = head;
        if (head == null){
            System.out.println("CLL Not Exist");
        }
        else {
            do {
                System.out.println(temp.data);
                temp = temp.next;
            }
            while (temp != head);
        }

    }

    public static void main(String[] args) {
        InsertionTraverser insertionTraverser = new InsertionTraverser();
                insertionTraverser.creation();
                insertionTraverser.traverse();

    }
}
