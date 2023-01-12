public class RunnerClass
{
    public static void main(String[] args)
    {
        int[ ] values = {6, 2, 1, 7, 12, 5};

        // Rewrite this loop as a for each loop and run to confirm
        for (int number : values)
        {
            if (number % 2 == 0) {
                System.out.println(number + " is even!");
            }
        }
    }
}
