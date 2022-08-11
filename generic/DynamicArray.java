package generic;

public class DynamicArray <T  > {
   private T[] array;
    private Integer count=0;
    public DynamicArray(int ArraySize){
        this.array= (T[]) new Object[ArraySize];
    }
 public void resizarequired(){
        if(this.array.length==count){
            T[] NewArray=(T[])new Object[count*2];
            for(int i=0; i<array.length; i++){
                NewArray[i]=array[i];
            }
            array=NewArray;
        }
 }
 public void insert(T item){
        if(count<array.length){array[count++]=item;
            System.out.println("0");
        }else{
            System.out.println("array is full");
        }
 }
  public void get(int index){
        if(0<=index && index<=array.length){
            System.out.println("the item of index :"+index+" is ( "+array[index]+" )");
        }else{
            new IndexOutOfBoundsException();}
  }
  public void removeAT(int index,T zero){
      if(0<=index && index<=array.length) {
          array[index]=zero;
          //array[index]=0;
      }
  }
}
