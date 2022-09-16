import java.util.Scanner;

public class varification
{
    public static void main(String[] args) 
    {
        int pass = 1234;
        Scanner os = new Scanner(System.in);
        int checkPass = os.nextInt();
        if(pass == checkPass){
            System.out.println("Login successful");
        }           
        else{
            try{
                throw new InvalidPasswordException();
            }
            catch(InvalidPasswordException e)
            {
                System.out.println("Invalid Exception.");
            }
            System.out.println("Hiii Abhi");
        }
    }
}

class InvalidPasswordException
{
    
}