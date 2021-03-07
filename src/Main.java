public class Main
{
    public static void main(String[] args)
    {
        for(int age = 15; age < 40; age++)
        {
            System.out.print(age + " années; vous pouvez: ");
            if(age < 16 && age < 18) {
                System.out.print("avoir un BSR, ");
            }
            else if(age >= 18) {
                System.out.print("avoir vos permis de conduire");
            }
            if(age >= 35) {
                System.out.print("vous pouvez vous présenter a la presidentielle");
            }
        }
    }
}
