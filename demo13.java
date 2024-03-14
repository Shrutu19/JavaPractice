class demo13{

    public static float width = 5.6f;
    public static float height = 8.5f;

    public static void main(String args[])
    { 
        float area = (width*height);
        float perimeter = 2*(width+height);
        System.out.println("Area is " + width + "*" +height + "=" +area);
        System.out.println("Perimeter is " + "2" + "*" + "(" + width + "+" +height + ")" + "=" +perimeter);
    }
}


// Expected Output
// Area is 5.6 * 8.5 = 47.60
// Perimeter is 2 * (5.6 + 8.5) = 28.20 