
import java.util.Scanner;

public class methodsOverloading {

    public static void main(String args[]) {
        Scanner cy = new Scanner(System.in);

        int a, b, c, d;

        System.out.print("Enter num1: ");
        a = cy.nextInt();
        System.out.print("Enter num2: ");
        b = cy.nextInt();
        System.out.print("Enter num3: ");
        c = cy.nextInt();
        System.out.print("Enter num4: ");
        d = cy.nextInt();
        
        int x= add(a,b);
        int y= prod(c,d);
        System.out.println("The product of two number is: "+ prod (x,y));
        System.out.println("The product of two number is: "+ add (x,y));
    }
    
        public static int add(int a, int b){
            return a+b;
        }
        public static int prod(int a, int b){
            return a*b;
        }
    }
