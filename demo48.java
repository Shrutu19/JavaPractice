// 8. Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
// Sample Output:

// 1                                                                      
// 3                                                                      
// 5                                                                      
// 7                                                                      
// 9                                                                      
// 11                                                                     
// ....                                                                     
                                                                    
// 91                                                                     
// 93                                                                     
// 95                                                                     
// 97                                                                     
// 99 

class demo48{
    public static void main(String args[])
    {
        for(int i = 1; i<100 ; i++)   {
           if(i%2!=0){
            System.out.println(i);
           }
        }
    }
}