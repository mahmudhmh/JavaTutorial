package oopsession;
/**
 *
 * @author Hussien
 */
public class ConstructorsGettersSetters {
       private String name;
        
       //Default Constructor
    public ConstructorsGettersSetters() {
    }

       //Valued Constructor
    public ConstructorsGettersSetters(String name) {
        this.name = name;
        //this?? This referes to the declared private String above equals 
        //the String which the user will enter in the main function.
    }
         
        //To Set the name 
    public void setName(String name) {
        this.name = name;
    }
        //To Get the name
    public String getName() {
        return name;
    }
    
    // what is the difference between the 2 methods
    
       
       
}
