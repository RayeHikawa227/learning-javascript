import java.util.Scanner;
import java.io.IOException;
public class ScanNumber {
    public static void main(String [] args){
        //Type your number
        System.out.println("Input your number: ");
        Scanner get = new Scanner(System.in);
        int nums = get.nextInt();
        for (int i = 1; i <= nums; i ++){
            System.out.println(i);
            //Creates an arrangement
            int array[] = {i};
            for (int j = 0; j < 1; j++){
                int math = array[j]/2;
                System.out.print(" //" + math);
            }
            System.out.println();
        }
        System.out.println("Complete Computing!");
    }
}
