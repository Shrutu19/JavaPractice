// class demo03{

//     public static void main(String args[])
//     {
//         int a = 50;
//         int b = 3;
//         System.out.println(a/b);
//     }
// }

import java.util.Scanner;
class demo03{

    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Division: " + a/b);
    }
}

