
import java.util.Scanner;

class Basic_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number");
        int secondNum = sc.nextInt();

        System.out.println("which opration do you want to perform");
        System.out.println("1. add");
        System.out.println("2. sub");
        System.out.println("3. mul");
        System.out.println("4. div");
        System.out.println("5. exit");

        int Option = sc.nextInt();
        switch (Option) {
            case 1:
            System.out.println("Addition of two numbers is :" + add(firstNum,secondNum));
            break;

            case 2:
            System.out.println("Subtraction of two numbers is :" + sub(firstNum,secondNum));
            break;

            case 3:
            System.out.println("Multiplication of two numbers is :" + mul(firstNum,secondNum));
            break;

            case 4:
            System.out.println("division of two numbers is :" + div(firstNum,secondNum));
            break;

            case 5:
            break;
        
            default:
                break;
        }

    }

    public static int add(int a,int b)
    {
        return(a+b);
    }

    public static int sub(int a,int b)
    {
        return(a-b);
    }

    public static int mul(int a,int b)
    {
        return(a*b);
    }

    public static int div(int a,int b)
    {
        return(a/b);
    }
    
}
