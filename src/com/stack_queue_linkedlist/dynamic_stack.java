package com.stack_queue_linkedlist;
//it is used to avoid problem of full space
public class dynamic_stack extends stack {
    public dynamic_stack(){
        super(); // it will call custom stack
    }
    public dynamic_stack(int size){
        super(); // it will call custom stack(int size)
    }
    //in this everything remains same except push function so
    @Override
    public boolean push(int item){
        //this takes care of it being full
        if(this.isFull()){
            //double the array size
            int [] temp= new int[data.length *2];

            //copy all previous items in new data arrya
            for (int i = 0; i < data.length-1; i++) {
                temp[i] = data[i];

            }
            data=temp;
        }
        //insert item
        return super.push(item);
    }
}
