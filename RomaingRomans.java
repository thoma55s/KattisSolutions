import java.util.*;
class RoamingRomans
{
    public static void main(String[] args) 
    {
        Scanner inputs = new Scanner(System.in);
        String input = inputs.nextLine();
        float num = Float.parseFloat(input);
        float miles = 5280;
        float roman = 4854;

        System.out.println(Math.round(num * (miles / roman * 1000)));
    }
}