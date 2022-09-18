package oopsession;
/**
 *
 * @author Hussien
 */
public class Watch {
    String charge = "Wireless";
    String controls []={"Power","Scoller","Sensor"};
    String color = "Metalic/Black";
    static boolean power=false;
    static int scroller =0;
    public static void powerOn(){
           power=true;
       }
    public static void powerOff(){
           power=false;
       }
    public static void ScrollerUp(){
           scroller++;
       }
    public static void ScrollerDown(){
           scroller--;
       }
}
