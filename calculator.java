import java.util.*;
class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------Simple Calculator------");
        while(true){
            System.out.print("Enter the symbol (+,-,*,/) or 'q' for quit:");
            char sy = sc.next().charAt(0);
            if(sy=='q'){
                System.out.println("------Exiting the Calculator------");
                break;
            }
            System.out.print("Enter two number: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch(sy){
                case '+': System.out.println("The Addition of two Numbers is: "+ (a+b)); break;
                case '-': System.out.println("The Subtraction of two Numbers is: "+ (a-b)); break;
                case '/': 
                if(b==0){
                    System.err.println("Division by Zero is Not Allowed!!");
                }
                else{
                    System.out.println("The Division of two Numbers is: "+ String.format("%.2f",(float) a/b));
                }
                break;
                case '*': System.out.println("The Multiplication of two Numbers is: "+ (a*b)); break;
                default : System.out.println("Enter correct operator!! "); break;
            }
        }
        sc.close();
    }
}
