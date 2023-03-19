package proje;

        import java.util.Scanner;

public class serhat_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  number;
        int multiplier;
        System.out.println("enter a number to multiply until 10:");
        number = scan.nextInt();
        for (multiplier= 1; multiplier<=10; multiplier++){
            System.out.printf("%d * %d = %d\n",number,multiplier,(number * multiplier));}
    }
}
