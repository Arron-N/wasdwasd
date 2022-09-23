public class Arrays
{
    public static void main(String[] args)
    {
        String[] abcde = {"Alpha","Bravo","Charlie","Delta","Echo","Foxtrot"};
        {
            for (int i = 0; i < abcde.length; i++) {
                System.out.println(abcde[i]);
            }
            for (int i = 0; i < abcde.length; i++) {
                System.out.print(abcde[i]);
            }
            for (int i = 0; i < abcde.length; i++) {
                if (i == 0) {
                    System.out.println(" ");
                }
                System.out.print(abcde[i]);
                if (i < abcde.length - 1) {
                    System.out.print("-");
                }
            }
        }
    }
}