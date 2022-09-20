package StackCode;
import java.util.Stack;
/**
 *
 * @author Hussien
 */
public class StackOperations {
    public static void main(String[] args) {
        // Stack Declaration + Operations
        Stack<String> games = new Stack<String>();
        // Stack<String> games = new LinkedList<String>();
        //Adding Elements to the Stack
        games.add("Valorant");
        games.push("Fortnite");
        games.add(2, "Call of Duty");
        //Print
        
        //Chk if it contains a Specific Element
        games.contains("Fortnite");
        //Print
        
        //Chk if the Stack is empty
        games.empty();
        //Print 
        
        //Get the Stack element at Index (1)
        games.get(1);
        //Print
        
        //Modifying the value of a specific element in the Stack
        games.set(1, "Leauge Of Legends");
        //Print
        
        //Return the Size of the stack
        games.size();
        //Print
        
        //Get the first element of the stack
        games.peek();
        //Print
        
        //Remove the elements of the stack
        games.pop();
        games.pop();
        //Print
    }
    
}
