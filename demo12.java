import java.util.Scanner;
class demo12{

public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Num1");
    int num1 = sc.nextInt();

    System.out.println("Enter Num2");
    int num2 = sc.nextInt();

    System.out.println("Enter Num3");
    int num3 = sc.nextInt();

    int avg = (num1+num2+num3)/3;

    System.out.println("Average: "+avg);

}


}