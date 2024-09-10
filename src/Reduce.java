public class Reduce
{
    public static void main(String[] args)
    {
        System.out.println(reduceNum(100));
    }

    public static int reduceNum(int num)
    {
        int count = 0;

        while (num != 0)
        {
            if (num % 2 == 0)
            {
                num /= 2;
            }
            else
            {
                num--;
            }

            count++;
        }

        return count;
    }
}
