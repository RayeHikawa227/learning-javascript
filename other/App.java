import java.text.DecimalFormat;
import java.util.Scanner;
public class App{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int male;
        int female;
        int get_total_students;
        double male_percent;
        double female_percent;
        //
        System.out.println("Enter the number of Male students");
        male = sc.nextInt();
          System.out.println("Enter the number of Female students");
        female = sc.nextInt();
        //
        get_total_students = male + female;
        male_percent = ((double) male / get_total_students) * 100;
        female_percent = ((double) female / get_total_students) * 100;
        //
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Number of Students: " + get_total_students);
        System.out.println("Male- " + df.format(male_percent) + "%");
        System.out.print("Female- " + df.format(female_percent) + "%");
    }
}