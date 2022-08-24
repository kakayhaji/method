package practice;

public class Main {
    public static void main(String[] args) {
        Array numbers=new Array(3);
        numbers.insert(10);
        numbers.insert(200);


        numbers.removeat(5);
        numbers.print();
        System.out.println(numbers.indexOf(30));

    }
}
