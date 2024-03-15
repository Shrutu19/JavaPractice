import java.util.Scanner;

class demo33{

    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int number = sc.nextInt();
         int sum =0;
         int remainder = 0;

         while(number!=0)
         {
            remainder = number%10;
            sum = sum+ remainder;

            number = number/10;

         }
         System.out.println("Sum of digits: "+sum);


    }
}