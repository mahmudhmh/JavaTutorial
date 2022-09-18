package oopsession;
/**
 *
 * @author Hussien
 */
public class Pen {
       String type = "Roto";
       String color = "Blue";
       double pt = 1.0;
       static boolean capOn = false;
       
       public static void capOn(){
           capOn=true;
       }
       public static void capOff(){
           capOn=false;
       }
}
