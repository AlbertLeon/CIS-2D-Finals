package stackexample;

import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {

        //the numbers on line 12 will be doing a countdown starting with 30 counting down to 1
        Stack stack = new Stack();
        for (int i = 1; i <= 30; i++) {
            stack.push(i);

        }
        while(!stack.empty())
        {
            System.out.print(stack.pop());
            System.out.print(",");
        }

        //Blast off will print out after it finishes counting down from 30 to 1
        System.out.println("BLAST-OFF!!");

    }

}
