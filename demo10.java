// class demo10{
//     public static void main(String args[]){
//        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
 
//     }
// }
 

class demo10{
    public static void main(String args[]){

        double a = 4.0;
        int b = 1;
        float c = 1.0f;
        int d = 3;
        int e = 5;
        int f = 7;
        int g = 9;
        int h = 11;
       System.out.println(a * (b - (c/d) + (c/e) - (c/f) + (c/g) - (c/h)));
 
    }
}
 


// Specified Formula :
// 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
// Expected Output
// 2.9760461760461765