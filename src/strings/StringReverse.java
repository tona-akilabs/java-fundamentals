package strings;

import java.util.List;
import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        String sample = "Father Charles Goes Down And Ends Battle";

        // An older way
        // Put it in the stack frontward
        Stack<String> myStack = new Stack<>();
        var forward = sample.split("\\s");
        for (String str : forward) {
            myStack.push(str);
        }

        // Print the stack backward
        while (!myStack.empty()) {
            System.out.print(myStack.pop());
            System.out.print(' ');  // inter-word spacing
        }
        System.out.println();

        // The easier way (Java 21+, no temporary variables)
        System.out.println(String.join(" ",
                List.of(sample.split("\\s")).reversed()));
    }
}
