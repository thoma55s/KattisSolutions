import java.util.*;
class Wertyu
{
    public static void main(String[] args) 
    {
        char[] keyboard = {'`','1','2','3','4','5','6','7','8','9','0','-','=',
                            'Q','W','E','R','T','Y','U','I','O','P','[',']','\\',
                            'A','S','D','F','G','H','J','K','L',';','\'',
                            'Z','X','C','V','B','N','M',',','.','/'
                          };
        Scanner inputs = new Scanner(System.in);
        while(inputs.hasNextLine())
        {
            
            String line = inputs.nextLine();
            if(line.equals(""))
                break;
            
            for (int i = 0 ; i != line.length() ; i++) 
            {
                char c = line.charAt(i);
                if(c == ' ')
                {
                    System.out.print(" ");
                }
                else
                {
                    for(int j = 0; j < keyboard.length; j++)
                    {
                        if(c == keyboard[j])
                        {
                            System.out.print(keyboard[j-1]);
                        
                        }
                    }//for j
                }
            }//for i
            System.out.println("");
        }//while True
    }//main
}//class