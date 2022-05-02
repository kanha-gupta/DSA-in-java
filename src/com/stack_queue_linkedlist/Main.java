package com.stack_queue_linkedlist;

public class Main {
    public static void main(String[] args) throws Exception {
       //custom stack implementation
       custom_queue queue=new custom_queue(2);
       queue.insert(30);
       queue.insert(60);
       queue.display();

    }
}