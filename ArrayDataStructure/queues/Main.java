package datastructuce.queues;

import java.util.Queue;

public class Main {
    public static void main(String [] args){
//        Queue<Integer> queue=new ArrayDeque<>();
//        queue.add(10);
//        queue.add(15);
//        queue.add(20);
//        System.out.println(queue);
//        reversing(queue);
//        datastructuce.queues.ArrayDeque a=new ArrayDeque();
//        a.add(10);
//       a.add(20);
//        a.add(30);
//        a.add(40);
//        a.add(50);
//
//        var y= a.toString();
//        System.out.println(a);
//        a.remove();
//       var  f= a.full();
//        System.out.println(f);
//        System.out.println(a);
//        System.out.println(a.isEmpty());
//     var x=a.peek();
//        System.out.println(x);
        prioretyqueue p= new prioretyqueue();
        p.insert(4);
        p.insert(1);
        p.insert(5);
        p.insert(2);
//        p.insert(3);
        var x=p.toString();
        System.out.println(x);
       p.remove();
       p.remove();
       x=p.toString();
        System.out.println(x);
    }
//    public static void reversing(Queue<Integer> queue){
//      int[] array=new int[10];
//      int index=0;
//        while(!queue.isEmpty()){
//            array[index++]=queue.remove();
//        }
//        index--;
//        while(index>=0){
//            queue.add(array[index--]);
//        }
//        System.out.println(queue);
//    }
}
