package generic;

public class Main {
    public static void main(String [] args){
        DynamicArray obj1=new DynamicArray<>(3);
        obj1.insert(4);
        obj1.insert(4);
        obj1.insert(4);
        obj1.resizarequired();
        obj1.insert(4);
        obj1.insert(4);
        obj1.insert(4);
        obj1.insert(4);
        obj1.removeAT(5,0);
        obj1.get(5);
    }
}
