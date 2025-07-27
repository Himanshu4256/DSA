package com.learning.SingleLinkedList;

import java.util.Scanner;

public class LinkedListDeletion {

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        Node head = null;

        void creation(){
            int data,n;
            Scanner sc = new Scanner(System.in);

            do {
                System.out.println("Enter Data ");
                data = sc.nextInt();
                Node newNode = new Node(data);

                if (head == null)
                    head = newNode;
                else {
                    System.out.println("Enter Data Press 1 for Beginning, 2 for at the End, 3 for Specific Position :::");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            newNode.next = head;
                            head = newNode;
                            break;
                        case 2:
                            Node temp = head;
                            while (temp.next != null) {
                                temp = temp.next;
                            }
                            temp.next = newNode;
                            break;
                        case 3:
                            int p;
                            System.out.println("Enter the position for deletion");
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
                System.out.println("Do you want to add more data if yes then Press 1, Else Press any other key ");
                n = sc.nextInt();
            }while (n == 1);
        }

        void traverse(){
            Node temp = head;

            if (head == null){
                System.out.println("Linked List Doesn't Exist");
            }else {
                while (temp!=null) {
                    System.out.print(" "+temp.data);
                    temp = temp.next;
                }
            }
        }

        void deletion(){
            int data,n,m,p;
            Scanner sc = new Scanner(System.in);

            do {
                if (head == null){
                    System.out.println("LL is emty");
                }
                else {
                    System.out.println("Enter 1 to delete the item from beginning. 2 to delete the item from the emd , 3 to delete the ite at specific position");
                    m = sc.nextInt();
                    switch (m) {
                        case 1:
                            Node temp = head;

                            temp = temp.next;
                            head = temp;
                            break;

                        case 2:
                            Node temp1 = head;
                            Node ptr = temp1.next;
                            while (ptr.next != null) {
                                temp1 = ptr;
                                ptr = ptr.next;
                            }
                            temp1.next = null;
                            break;

                        case 3:
                            System.out.println("enter position of node to be deleted");
                            p = sc.nextInt();
                            Node temp2 = head;
                            Node ptr1 = temp2.next;

                            for (int i = 0; i<p-1; i++){
                                temp2 = ptr1;
                                ptr1 = ptr1.next;
                            }
                            temp2.next= ptr1.next;
                            break;

                    }
                }
                System.out.println("Do you want to delete more data. if yes press 1");
                n = sc.nextInt();
            }while (n==1);

        }

        public static void main(String[] args) {
            LinkedListDeletion lld = new LinkedListDeletion();
            lld.creation();
            lld.deletion();
            lld.traverse();
        }

}
