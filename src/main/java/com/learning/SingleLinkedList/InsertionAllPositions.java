package com.learning.SingleLinkedList;

import java.util.Scanner;

public class InsertionAllPositions {

    static class Node {
        int data;
        Node next;
        Node (int data){
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

    public static void main(String[] args) {
        InsertionAllPositions insertionAllPositions = new InsertionAllPositions();
        insertionAllPositions.creation();
        insertionAllPositions.traverse();
    }
}

//case 3 - Running

//Enter Data
//10
//Do you want to add more data if yes then Press 1, Else Press any other key
//1
//Enter Data
//20
//Enter Data Press 1 for Beginning, 2 for at the End, 3 for Specific Position :::
//        2
//Do you want to add more data if yes then Press 1, Else Press any other key
//1
//Enter Data
//30
//Enter Data Press 1 for Beginning, 2 for at the End, 3 for Specific Position :::
//        2
//Do you want to add more data if yes then Press 1, Else Press any other key
//1
//Enter Data
//40
//Enter Data Press 1 for Beginning, 2 for at the End, 3 for Specific Position :::
//        3
//Enter the position for deletion
//1
//Do you want to add more data if yes then Press 1, Else Press any other key
//2
//        10 40 20 30
//Process finished with exit code 0

