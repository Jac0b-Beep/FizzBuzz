public class Multiples
{
    public static void main(String[] args)
    {
        System.out.println(multiplesOfThreeOrFive(1000));
    }

    public static int multiplesOfThreeOrFive(int max)
    {
        int count = 0;

        for (int i = 1; i < max; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                count++;
            }
        }

        return count;
    }
}
