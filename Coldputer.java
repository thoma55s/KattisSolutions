import java.util.*;
class Coldputer
{
    public static void main(String[] args)
    {
        Scanner inputs = new Scanner(System.in);
        int temps = inputs.nextInt();
        int count = 0;
        for(int i = 0; i < temps; i++)
        {
            if(inputs.nextInt() < 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}