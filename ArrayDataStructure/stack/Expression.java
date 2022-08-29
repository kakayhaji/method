package datastructuce.stack;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> leftlist= Arrays.asList('(','[','{','<');
    private final List<Character> rightlist = Arrays.asList(')',']','}','>');
    Stack<Character> stack = new Stack<>();
    public Boolean balanced(String str) {
        for (char ch : str.toCharArray()) {
            if (checkmethod(ch)) stack.push(ch);
            if (cheakmethod_2(ch)) {
                if (stack.empty()) return false;
                var top =stack.pop();
                if( !cheakmethod_3(top,ch)) return false;
            }
        }return stack.empty();
    }
    private  Boolean  checkmethod(char ch){

        return leftlist.contains(ch);
    }
    private Boolean cheakmethod_2(char ch ){
        return rightlist.contains(ch);
    }
    private Boolean cheakmethod_3(char left , char right){
        return  leftlist.indexOf(left)==rightlist.indexOf(right);
    }
}
