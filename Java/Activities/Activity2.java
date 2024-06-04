package activities;

public class Activity2 {
    public static void main(String[] args)
    {
        int[] AnArray = {10, 77, 10, 54, -11, 10};

        int numToFind = 10;
        int expectedSum = 30;

        System.out.println("Here is answer: " + answer(AnArray,numToFind,expectedSum));
    }
    public static boolean answer(int[] numbers, int numToFind, int expectedSum)
    {
        int temp = 0;
        for (int number : numbers)
        {
            if (number == numToFind)
            {
                temp += numToFind;
            }
            if (temp > 30){
                break;
            }
        }
        return temp == expectedSum;
    }
}
