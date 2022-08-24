package practice.ArrayDataStructure;

public class Array extends Exercise_2 {
    int[] array;
   int  j=0;
    public Array(int length){
        array=new int[length];
    }
    public void insert(int item){
        if(j<array.length){
            array[j++]=item;
        }
        else{
            int[] NewArray=new int[array.length+1];
            for(int i=0; i< array.length; i++){
                NewArray[i]=array[i];
            }
            array=NewArray;
            array[j]=item;

        }
    }
    public void removeat(int index) {
        if(index >=0 && index<array.length ){
        int[] newarray=new int[array.length-1];
        for(int i=0; i<newarray.length; i++){
            if(index>i) {
                newarray[i] = array[i];
            }else{
                newarray[i]=array[i+1];
            }
        }
        array=newarray;}else{
            System.out.println("enter the true index ");
        }

    }
    public void print(){
        for(int i=0; i<j; i++){
            System.out.println(array[i]);
        }
    }
    public int indexOf(int item){
        boolean result;
        for(int i=0; i<array.length; i++)
            if (item == array[i]) {
                return i;
            }
        return -1;
    }
}
