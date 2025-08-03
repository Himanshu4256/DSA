package com.learning.circularLinkedList;

import java.util.Scanner;

public class Cll_Deletion {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void creation() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Data ::");
            n = sc.nextInt();

            Node newNode = new Node(n);

            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                newNode.next = head;
                head = newNode;
                tail.next = head;
            }

            System.out.println("Press 1 if you want to enter more data");
            n = sc.nextInt();
        } while (n == 1);
    }

    void traverser() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List Doesn't Exist");
        } else {
            do {
                System.out.println(temp.data);
                temp = temp.next;
            } while (temp != head); // Fix: loop until it circles back to head
        }
    }

    void deletion() {
        int n, m, p;
        Scanner sc = new Scanner(System.in);

        do {
            if (head == null) {
                System.out.println("LL is empty");
            } else {
                System.out.println("Enter 1 to delete the item from beginning. 2 to delete the item from the end , 3 to delete the item at specific position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        if (head == tail) {
                            head = null;
                            tail = null;
                        } else {
                            Node temp = head;
                            temp = temp.next;
                            head = temp;
                            tail.next = head;
                        }
                        break;

                    case 2:
                        if (head == tail) {
                            head = null;
                            tail = null;
                        } else {
                            Node temp1 = head;
                            Node ptr = temp1.next;
                            while (ptr.next != head) {
                                temp1 = ptr;
                                ptr = ptr.next;
                            }
                            temp1.next = head;
                            tail = temp1;
                        }
                        break;

                    case 3:
                        System.out.println("Enter Data at Specific position");
                        p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 1; i <p-1 ; i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;
                }
            }
            System.out.println("Do you want to delete more data. if yes press 1");
            n = sc.nextInt();
        } while (n == 1);
    }

    public static void main(String[] args) {
        Cll_Deletion cllD = new Cll_Deletion();
        cllD.creation();
        cllD.deletion();
        cllD.traverser();
    }
}
