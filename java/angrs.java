public class angrs {
    public static void main(String[] args) {
        int n = 1634;
    int r;
    r=n;
       int sum=0;
       int Digit;
       while (n!=0) {
        Digit=n%10;
        sum=sum+Digit*Digit*Digit*Digit;
        n/=10;
       }
       if(r==sum){
 System.out.println("Armstrong number ");
       }
      else{
        System.out.println("not a Armstrong number ");
      }
    }
}
