package datastructuce.stack;

import java.util.Stack;

public class StringReverser {

 public String StringReverser(String a){
     String stringreverser ="";
     Stack<Character> stack= new Stack<>();
     for(int i=0; i<a.length(); i++)
         stack.push(a.charAt(i));
     for(int i=0; i<a.length(); i++)
         stringreverser+=stack.pop();
     return stringreverser;
 }
}
