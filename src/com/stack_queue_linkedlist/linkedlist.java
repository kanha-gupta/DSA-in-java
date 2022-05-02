package com.stack_queue_linkedlist;

public class linkedlist {
//every ll has head and tail
    private Node head;
    private Node tail;

    private int size;
    public linkedlist(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail == null){
            tail = head;
        }
        size +=1;
    }

    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail= node;
        size++;
    }
    public void display(){
        Node temp=head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    //Node is a custom datatype made with 2 values of value & a next which points to the next.
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next=next;
        }
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp= head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertFirst(4);
        ll.insertFirst(4);
        ll.insertFirst(4);
        ll.insertLast(69);
        ll.display();
    }

}