package proje;

import java.util.Arrays;
import java.util.Scanner;

public class ders {
    public static void main(String[] args) {
        int n = getNumberOfInputs();
        System.out.println("You want to input " + n + " numbers.");

        int[] input2=input(n);
        int max = Arrays.stream(array).max();
        System.out.println("your max is: "+max);
        int min = Arrays.stream(array).min();
        System.out.println("your minimum is: "+min);
}



    public static int getNumberOfInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to input? ");
        int n = scanner.nextInt();
        return n;

}
    public static int[] input(int n){
    Scanner scanner = new Scanner(System.in);

    System.out.println("please enter your numbers");
        int[] array = new int[n];
        for (int i = 0;i<n;i++){
           array[i]= scanner.nextInt();
        }
        return array;
    }
}





