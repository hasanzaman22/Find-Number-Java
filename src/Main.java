import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,5,6,9};
        Scanner scn = new Scanner(System.in);
        System.out.println("Type the number you want to find in the list: ");
        int num = scn.nextInt();

        String sum = num + " not on the list";

        for (int x : numbers){
            if(x==num){
                sum = num + " is on the list.";
                break;
            }
        }

        System.out.println(sum);
    }
}