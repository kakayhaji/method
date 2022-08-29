package datastructuce.queues;

import java.util.Arrays;

public class ArrayDeque {
    int[] array=new int[5];
    int index=0;
    public void add(int num){
        if(index>=5) {
            System.out.println("Your array is full not enter array");
           }else{ array[index++]=num;}


    }

    public void remove(){
        index--;
       for(int i=0; i<index; i++) {
           array[i]=array[i+1];}
       array[array.length-1]=0;
    }

    public int peek(){
        return array[0];
    }
    public Boolean isEmpty(){
        return index==0;
    }


  public Boolean full(){
        return index==5;
  }

  public String toString(){
       var newarray= Arrays.copyOfRange(array,0,index);
        return Arrays.toString(newarray);
  }
}
