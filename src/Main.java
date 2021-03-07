public class Main
{
    public static void main(String[] args)
    {
        for(int age = 15; age < 40; age++) // avec incrementation et decrementation vaut mieux utiliser le cycle for et PAS -while-
        {
            System.out.print(age + " années; vous pouvez: ");  // lister par age jusqu a 35 ans
            if(age > 16 && age < 18) {
                System.out.print("avoir un BSR");
            }
            else if(age >= 18) {
                System.out.print("avoir vos permis de conduire");
            }
            else {
                System.out.print("tu peux rouler en velo");
            }
            if(age >= 35) {
                System.out.print(", vous pouvez vous présenter a la presidentielle");
            }

            System.out.println();
        }
    }
}
