package com.stack_queue_linkedlist;

public class custom_queue{
    protected int[] data;

    private static final int Default_size=10;

    int end=0;
    public custom_queue(){
        this(Default_size);
    }
    public custom_queue(int size) {
        this.data=new int[size];
        //this will set the size of an array set by us.
    }
    public boolean isFull() {
        //logically its full when ptr is at last
        return end== data.length; //ptr is at last index

    }
    public boolean isEmpty() {
        //logically its empty if ptr is at -1 so thats why
        return end== 0;

    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end]= item;
        end++;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty");

        }
        int removed= data[0];
        //shift elements to left
        for (int i = 0; i < end; i++) {
            data[i-1]= data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("end");
    }
}
