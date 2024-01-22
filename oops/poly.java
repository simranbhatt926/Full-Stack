package oops;
        class Student {
        
            void Study(){
                System.out.print("hii");
            }
        }
        class cs extends Student {
        void Study(){
System.out.print("java");
        }
            
        }
        class MBA extends Student {
        
            void Study(){
                System.out.println("account");
            }
        }
        public class poly {
        public static void main(String[] args) {
            MBA obj=new MBA();
            obj.Study();

        }
            
        }


