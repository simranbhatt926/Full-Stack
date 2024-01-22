public class fibonacci {
    public static void main(String[] args) {
        int  a = 0, b = 1;
        System.out.println("Fibonacci Series  " + 10 + " terms:");
    
        for (int i = 1; i <= 10; ++i) {
            a=a+b;
            b=a-b;
          System.out.print(a + ", ");
    
          // compute the next term


        }
    }
    
}