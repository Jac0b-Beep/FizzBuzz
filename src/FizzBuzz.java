/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz
{
    public static void main(String[] args)
    {
//        for (int i = 1; i < 100; i++)
//        {
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5)
//            {
//                System.out.println("Fizz Buzz");
//            }
//            else if (divisibleBy3)
//            {
//                System.out.println("Fizz");
//            }
//            else if (divisibleBy5)
//            {
//                System.out.println("Buzz");
//            }
//            else
//            {
//                System.out.println(i);
//            }
//        }
        
        int round = 1;
        
        while (round < 100)
        {
            round = doFizzBuzz(round);
        }
    }

    private static int doFizzBuzz(int round) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = round % 3 == 0;
        boolean divisibleBy5 = round % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5)
        {
            System.out.println("Fizz Buzz");
        }
        else if (divisibleBy3)
        {
            System.out.println("Fizz");
        }
        else if (divisibleBy5)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(round);
        }

        round++;
        return round;
    }
}
