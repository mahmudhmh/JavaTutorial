package queueandoperations;
import java.util.*;
/**
 *
 * @author Hussien
 */
public class QueueAndOperations {
    public static void main(String[] args) {
         // Queue Declaration + Operations
        Queue<String> games = new PriorityQueue<String>();
        // Queue<String> games = new LinkedList<String>();
        //Adding Elements to the Queue
        games.add("Valorant");
        games.offer("Fortnite");
        games.add("Call of Duty");
        games.offer("CrossFire");
        //Print
        
        //Chk if it contains a Specific Element
        games.contains("Fortnite");
        //Print
        
        //Chk if the Queue is empty
        games.isEmpty();
        //Print 
        
        //Return the Size of the queue
        games.size();
        //Print
        
        //Get the first element of the queue
        games.peek();
        //Print
        
        //ToArray Operation
        games.toArray();
        //Print
        
        //Remove the elements of the queue
        games.poll();
        games.poll();
        games.remove();
        games.remove("CrossFire");
        //Print
    }
    
}
