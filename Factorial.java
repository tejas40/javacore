import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        Factorial(number);

    }

    public static void Factorial(int num)
    {
        int fac=1;
        for(int i=1;i<=num;i++)
        {
            fac = fac *i;
        }
        System.out.println(fac);


    }
    
}
