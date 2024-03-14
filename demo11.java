import java.util.Scanner;
class demo11{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter Radius: ");
        float r = sc.nextFloat();
    
        System.out.println("Perimeter of the circle: "+(2*3.14*r));
     
        System.out.println("Area of the circle: "+(3.14*r*r));
 
    }
}