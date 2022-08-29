package datastructuce.stack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //string reverser Exercise
//       StringReverser stack=new StringReverser();
//     String a=  stack.StringReverser("hello");
//        System.out.println(a);



        
        //expression Exercise
//        Expression ex = new Expression();
//        String str = "(<3>+<1>)";
//        var exp=ex.balanced(str);
//        System.out.println("this expression is Balanced :"+exp);




        //stack-exercise-1
//        Stack obj = new Stack();
//        obj.push(8);
//        obj.push(20);
//        obj.push(40);
//        System.out.println(Arrays.toString(obj.array));
////        int x=obj.pop();
////        System.out.println(x);
//        System.out.println(Arrays.toString(obj.array));
////        int y=obj.pop();
////        System.out.println(y);
//        System.out.println(Arrays.toString(obj.array));
//     int  y=obj.pop();
//     System.out.println(y);
//        System.out.println(obj.isEmpty());
//        int x= obj.peek();
//        System.out.println(x);



      //stack-exercise-2
        Exercise_Stack a=new Exercise_Stack();
        a.push1(10);
        a.push1(20);
        a.push2(30);
        a.push2(40);
        a.Tostring(2);
        a.pop1();
        a.pop2();
        System.out.println(a.isEmpty1());
        System.out.println(a.isEmpty2());
        a.Tostring(1);
        a.pop1();
        a.pop2();
        System.out.println(a.isEmpty1());
        System.out.println(a.isEmpty2());
    }
}
