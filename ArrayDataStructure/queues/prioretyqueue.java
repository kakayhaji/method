package datastructuce.queues;

import java.util.Arrays;

public class prioretyqueue {




    int[] array=new int[5];
    private int count;
    public void insert(int item) {
int i;
        for( i=count-1; i>=0; i--){
            if(array[i]>item)
                array[i+1]=array[i];
            else break;
        }
        array[i+1] = item;
        count++;
    }//insert
    public int remove(){
        return array[--count];
    }
    public Boolean isEmpty(){
        return count==0;
    }
    public String toString(){
        var newarray= Arrays.copyOfRange(array,0,count);
        return Arrays.toString(newarray);
    }



}
