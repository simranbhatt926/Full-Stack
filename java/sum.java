public class sum {
    public static void main(String[] args) {
        int n=1254;
        int sum=0;
        while (n!=0){
            int Digit = n%10;
         
          sum =sum+Digit;
            n = n/10;
        }
         System.out.print(sum);
    }
}
