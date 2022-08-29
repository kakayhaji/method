package datastructuce;

public class Main  {
    public static void main(String[] args) {
        Array numbers=new Array(3);
//        numbers.insert(10);
//        numbers.insert(200);
//        numbers.removeat(5);
//        numbers.print();
//        System.out.println(numbers.indexOf(30));
        numbers.insertAt(0,10);
        numbers.insertAt(1,2);
        numbers.insertAt(2,2);
        numbers.insertAt(3,3);
        numbers.reverse();
        numbers.Max();
        numbers.intersect();

    }
}
