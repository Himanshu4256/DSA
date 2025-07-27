package com.learning.SingleLinkedList;

import java.util.Scanner;

public class Create_IterateLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void creation(){
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Data ");
            data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null){
                head = newNode;
            }
            else {
                newNode.next = head;
                head = newNode;
            }
            System.out.println("Do you want to add more data if yes then Press 1, Else Press any other key ");
            n = sc.nextInt();

        }while (n == 1);

    }

    void traverser(){
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

    public static void main(String[] args) {
        Create_IterateLinkedList createIterateLinkedList = new Create_IterateLinkedList();
        createIterateLinkedList.creation();
        createIterateLinkedList.traverser();
    }

}
