package datastructuce.stack;

import java.util.Arrays;

public class Exercise_Stack {
    int[] array_1=new int[1];
    int[] array_2=new int[1];
    int count_1;
    int count_2;
    public void push1(int input){
        if(array_1.length==count_1)   {
            array_1=incrementArray(array_1,count_1);
        }
        array_1[count_1++]=input;
    }

    public void push2(int input){
        if(array_2.length==count_2)   {

            array_2=incrementArray(array_2,count_2);
        }
        array_2[count_2++]=input;
    }

    public int pop1 (){
        int lastitem=this.array_1[this.array_1.length-1];
//        int[] newarray= new int[this.array.length-1];
//        for(int i=0; i< newarray.length; i++){
//            newarray[i]=this.array[i];
//        }

        this.array_1=decrementArray(array_1);
        count_1--;
        return lastitem;
    }
    public int pop2 (){
        int lastitem=this.array_2[this.array_2.length-1];
        this.array_2=decrementArray(array_2);
        count_2--;
        return lastitem;
    }
    public Boolean isEmpty1(){
        if(array_1.length==0)   return true;
        return false;
    }
    public Boolean isEmpty2(){
        if(array_2.length==0)   return true;
        return false;
    }
//    public Boolean isFull1(){
//        if(array_1.length==count_1)   return true;
//        return false;
//    }
//    public Boolean isFull2(){
//        if(array_2.length==count_2)   return true;
//        return false;
//    }

    private int[] incrementArray(int[] array , int count){
            int[] newarray = new int[count+1];
            for(int i=0; i<array.length; i++){
                newarray[i]=array[i];
            }//for
            return newarray;
    }//incrementarray
    private int[] decrementArray(int[] array){
        int[] newarray= new int[array.length-1];
        for(int i=0; i< newarray.length; i++){
            newarray[i]=array[i];
        }//for
        return newarray;
    }//decrementarray

    public void Tostring(int i){
        if(i==1) System.out.println(Arrays.toString(array_1));
       if(i==2) System.out.println(Arrays.toString(array_2));
    }//tostring
}//class
