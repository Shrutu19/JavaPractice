import java.util.Scanner;
class demo15{
    public static void main(String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        
       
        System.out.println("After Swapping Value of a is " + a + " and " + "b is " + b);
    }
}