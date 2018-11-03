import java.util.*;
class SevenWonders
{
    public static void main(String[] args) 
    {
        Scanner inputs = new Scanner(System.in);
        String input = inputs.nextLine();
        int t = 0;
        int c = 0;
        int g = 0;
        
        String[] chars = input.split("");
        for(int i = 0; i < chars.length; i ++)
        {

            if(chars[i].equals("T"))
                t++;
            if(chars[i].equals("C"))
                c++;
            if(chars[i].equals("G"))
                g++;
        }

        System.out.print(t * t + c * c + g * g + 7 * Math.min(Math.min(t,c),Math.min(c,g)));
    }
}