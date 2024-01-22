public class heart {
    public static void main(String[] args) {
        String Red="\u001B[31m";
        for(int i=0;i<=5;i++){
            for(int j=0;j<=6;j++){
                if(i==0 && j%3!=0|| i==1 && j%3==0|| i-j==2 ||  i+j==8){
                System.out.print(Red+"* ");
            }
                
                else{
                System.out.print(" " + " ");
               }

            }
            System.out.println();
        }
    }
    
}
