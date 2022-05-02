package com.stack_queue_linkedlist;

public class circular_queue {
    protected int[] data;

    private static final int Default_size=10;
    protected int  front=0;
    protected int  end=0;
    private int size=0;
    public circular_queue(){

        this(Default_size);
    }
    public circular_queue(int size) {
        this.data=new int[size];
        //this will set the size of an array set by us.
    }

    public boolean isFull() {
        //logically its full when ptr is at last
        return size== data.length; //ptr is at last index
//we put size instead of end because it will keep rotating so size should be the size
// of array or else it will never be full
    }
    public boolean isEmpty() {
        //logically its empty if ptr is at -1 so thats why
        return size== 0;

    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end]= item;
        end++;
        end=end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty");

        }
        int removed= data[front++]; //refer to notebook notes
        front=front % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        int i=front;
        do{
            System.out.print(data[i]+ "->");
            i++;
            i %=data.length;
        } while (i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        circular_queue cq =new circular_queue(3);
        cq.insert(4);
        cq.insert(5);
        cq.insert(6);
        cq.display();
        System.out.println(cq.remove());
        //4 is removed from first & 133 is inserted at the last.
        cq.insert(133);
        cq.display();

    }
}
