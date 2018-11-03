import java.text.DecimalFormat;
import java.util.*;
class AboveAverage
{
    public static void main(String[] args)
    {
        Scanner inputs = new Scanner(System.in);
        int problems = inputs.nextInt();
        int arraySize;
        for(int i = 0; i < problems; i++)
        {

            
            arraySize = inputs.nextInt();
            int[] array = new int [arraySize];
            int total = 0;
            for(int j = 0; j < arraySize; j++)
            {
                int num = inputs.nextInt();
                total += num;
                array[j] = num;
            }
            float average = (float) total / (float) arraySize;
            int above = 0;
            for(int j = 0; j < arraySize; j++)
            {
                if(array[j] > average)
                {
                    above++;
                }
                
            }
            double percent = (double) above / (double) arraySize * 100.0;
            System.out.printf("%.3f", percent);
            System.out.println("%");

        }
    }    
}