import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        fibonacci(number);

    }

    public static void fibonacci(int num)
    {
        int n1=0;
        int n2=1;
        int n3=0;
        System.out.print(n1 + " "+ n2+" ");
        num = num-2;
        while(num > 0)
        {
            n3 = n1+n2;
            n1 = n2;
            n2=n3;

        System.out.print(n3+" ");
        num --;
        }


    }
    
}
