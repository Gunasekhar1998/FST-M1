package activities;

public class Activity8
{
    public static void main(String[] a){
        try {
            // Method call with correct input
            Activity8.exceptionTest("print to console");
            // Method call with incorrect input
            Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("don't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }
    static void exceptionTest(String str) throws CustomException
    {
        if(str == null)
        {
            throw new CustomException("null String");
        } else
        {
            System.out.println(str);
        }
    }
}
