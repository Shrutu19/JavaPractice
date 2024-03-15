// 38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
// Expected Output

// The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
// letter: 23                                               
// space: 9                                                 
// number: 10                                               
// other: 6



class demo38{ 
    public static void main(String args[])
    {
        String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for(int i=0;i<s.length();i++)
        {
           char ch = s.charAt(i);
           if(Character.isLetter(ch))
           {
            letterCount++;
           }
           else if(Character.isSpaceChar(ch))
           {
            spaceCount++;
           }
           else if(Character.isDigit(ch))
           {
            numberCount++;
           }
           else{
            otherCount++;
           }
        }

        System.out.println("Letter: "+letterCount);
        System.out.println("Space: "+spaceCount);
        System.out.println("Number: "+numberCount);
        System.out.println("Other: "+otherCount);




    }
}