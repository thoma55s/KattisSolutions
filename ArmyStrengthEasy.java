import java.util.*;
class ArmyStrengthEasy//SOLVES HARD VERSION TOO
{
    public static void main(String[] args) 
    {

        Scanner inputs = new Scanner(System.in);
        int tests = inputs.nextInt();
        for(int i = 0; i < tests; i++)
        {
            int godArmySize = inputs.nextInt();
            int mechArmySize = inputs.nextInt();
            
            int godMax = inputs.nextInt();
            for(int j = 1; j < godArmySize; j++)
            {
                int temp = inputs.nextInt();
                if(godMax < temp)
                    godMax = temp;
            }//for j

            int mechMax = inputs.nextInt();
            for(int j = 1; j < mechArmySize; j++)
            {
                int temp = inputs.nextInt();
                if(mechMax < temp)
                    mechMax = temp;
            }//for j

           
            if (godMax >= mechMax)
                System.out.println("Godzilla"); 
            else
                System.out.println("MechaGodZilla");
            
        }//for i 
    }//main
}//class