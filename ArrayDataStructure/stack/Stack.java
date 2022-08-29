package datastructuce.stack;

public class Stack {
    int[] array= new int[1];
   private int index=0;
    public void push(int input){
        if(array.length==index)   {
         int[] newarray = new int[index+1];
            for(int i=0; i<array.length; i++){
                newarray[i]=array[i];
            }
            array=newarray;
        }
           array[index++]=input;

    }
    public int pop (){
        int lastitem=this.array[this.array.length-1];
        int[] newarray= new int[this.array.length-1];
        for(int i=0; i< newarray.length; i++){
           newarray[i]=this.array[i];
        }
        this.array=newarray;
        index--;
        return lastitem;
    }
    public Boolean isEmpty(){
        if(array.length==0)   return true;
        return false;
    }
    public int peek(){
return array[index-1];
    }

}
