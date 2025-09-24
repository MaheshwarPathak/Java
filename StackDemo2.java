import java.util.Stack;
public class StackDemo2 {
    static void stack_push(Stack<Integer>stack){
        for(int i=0;i<5;i++){
            stack.push(i);
            System.out.println(i);
        }
    }
    static void stack_pop(Stack<Integer>stack){
        System.out.println("pop operation:");
        for(int i=0;i<5;i++){
            int y=stack.pop();
        System.out.println(y);
        }
    }
}
