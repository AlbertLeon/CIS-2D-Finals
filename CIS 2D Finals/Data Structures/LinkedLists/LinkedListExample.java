package linkedlistexample;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {


    public static void main(String[] args) {
        LinkedList states = new LinkedList();
        states.add("Alaska");
        states.add("Texas");
        states.add("Florida");
        states.add("Washington");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Pennsylvania");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");
        states.add("New York");


        //Whichever state you add in states.addFirst it will be the first state to print out
        //California will be the first of the list to print out
        states.addFirst("California");
        System.out.println(states);

        //This will print out the last state on the list which is New York
        System.out.println("last state in my list: "+states.getLast());

        //iterate backwards through the list
        //it will print out the list in reverse
        ListIterator iterator = states.listIterator(states.size());
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());

        }


    }


}

/*After you run the code the list of states will print out forward
starting with California and ending with New York and another same list of state will print
out in reverse order
*/


