package recursion;
/**
 *
 * @author Hussien
 */
public class Recursion {
    
    public static void main(String[] args) {
        //Factorial of Numbers
        Factorial f= new Factorial ();
      System.out.println("Factorial of 3 is " + f.fact(3));
      System.out.println("Factorial of 4 is " + f.fact(4));
      System.out.println("Factorial of 5 is " + f.fact(5));
      
      //Fibonaci Series
       int N = 10;
        // Print the first N numbers
        for (int i = 0; i < N; i++) {
  
        System.out.print(fib(i) + " ");
       
    }
  }
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }
    
}
