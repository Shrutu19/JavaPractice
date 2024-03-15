// 41. Write a Java program to print the ASCII value of a given character.
// Expected Output

// The ASCII value of Z is :90

import java.util.Scanner;
class demo41{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter ");
        char ch = sc.next().charAt(0);
        int ascii = (int)ch;
        System.out.println("ASCII Value :"+ascii);
    }
}

