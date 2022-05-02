package com.stack_queue_linkedlist;

public class stack {
    protected int[] data;
    private static final int Default_size=10;
    int ptr=-1;


    public stack(){
        this(Default_size);
    }
    public stack(int size) {
        this.data=new int[size];
        //this will set the size of an array set by us.
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack full");
            return false;
        }
        //this is to add items in an array.ptr will point the latest inserted item
        ptr++;
        data[ptr]=item;
        return true;
    }


    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("cannot pop from an empty stack");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("cannot peek from an empty stack");
        }
        return data[ptr];
    }
    public boolean isFull() {
        //logically its full when ptr is at last
        return ptr== data.length-1; //ptr is at last index

    }
    public boolean isEmpty() {
        //logically its empty if ptr is at -1 so thats why
        return ptr== -1;

    }
}
