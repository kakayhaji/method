package practice.ArrayDataStructure;

import java.util.Arrays;

public class Exercise_2 {
    int [] array=new int[1];
    int j=0;
    public void Max(){
        int result=0;
        for(int i=0; i< array.length; i++){
           result= Math.max(result,array[i]);
        }
        System.out.println("the muximum number is = "+result);
    }
    public void intersect(){

        for(int i=0; i< array.length; i++){
            int common=0;
            for(int b=0; b< array.length; b++){
                if(array[i]==array[b]){
                  common++;
                }
            }
            if(common>=2) System.out.println("the common number is ="+array[i]);
        }

    }
    public void reverse(){
       int[] newArray=new int[array.length];
       for(int i=0; i< array.length; i++){
           newArray[i]=array[array.length-1-i];
       }
       array=newArray;
        System.out.println(Arrays.toString(array));
    }
    public void insertAt(int index , int item) {
        if (j == array.length) {
            int[] NewArray = new int[array.length * 2];
            for(int i=0; i<j; i++) NewArray[i]=array[i];
            array=NewArray;
        }
        this.array[index]=item;
        j++;
    }


}
