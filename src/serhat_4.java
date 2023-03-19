import java.util.Scanner;

public class serhat_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first integer");
        int bölünen = scan.nextInt();
        System.out.println("enter second integer");
        int bölen = scan.nextInt();

        int counter= 0;

        while (bölünen>=bölen){
            bölünen= bölünen-bölen;
            counter++;
        }

        int remainder= (bölünen-(bölen * counter));
        System.out.println("remainder = " + remainder);
        System.out.println("the answer is :"+ counter);
    }
}
