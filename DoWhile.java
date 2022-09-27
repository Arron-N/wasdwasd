public class DoWhile
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        int i = 10;
        int k = 80;
        do {
            System.out.println(i + " is less than 15");
            i += 1;
        } while (i < 15);
        do {
            System.out.println( k + " is greater than 5");
            k = k/2;
        } while (k > 5);
        do {
            System.out.println(a*b);
            a++;
            b = b + 4;
        } while (a < 10 && b <= 20);
        System.out.println("Hello World!");
    }

    public static void main(String[] args)
    {        
        DoWhile hw = new DoWhile();
        hw.run();
    }
}

