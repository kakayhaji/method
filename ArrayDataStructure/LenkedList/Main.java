package datastructuce.LenkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lenkedlist a = new Lenkedlist();
        a.addlast(10);
        a.addlast(20);
        a.addlast(30);
        a.addlast(40);
        a.addlast(50);
//        a.addfirst(5);
//        a.addfirst(7);
//        a.addfirst(4);
//        a.addfirst(9);
        System.out.println(a.siza());
        var array = a.toarray();
        System.out.println(Arrays.toString(array));
        a.reverse();
        var aray = a.toarray();
        System.out.println(Arrays.toString(aray));
      var b=  a.kthNode(0);
        System.out.println(b);


        System.out.println(a.conrains(9));




    }

}
