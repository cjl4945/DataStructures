import java.util.Iterator;
import java.util.Stack;

public class Queue {


    public static void useStack(){
        Stack<String> stk = new Stack<>();
        stk.push("one");
        stk.push("stop");
        
        System.out.println(stk.peek());
        for (String str : stk){
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
        useStack();
    }

}
