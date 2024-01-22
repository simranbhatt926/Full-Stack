public class reverse {
    public static void main(String[] args) {
        int n = 121;
        int sum=0;
        int r;
        r=n;
        while (n!=0) {
         int  Digit=n%10;
            sum=sum*10+Digit;
          n=  n/10;
        }
          if(r==sum){
            System.out.print("Pelindrom number: ");
          } 
          else{
            System.out.print("Not a pelindrom number: ");
          }
            
        }
    }

