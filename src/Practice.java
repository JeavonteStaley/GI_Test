import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int yourAge = myAge(0,0,0);
        System.out.println("Your age is: " + yourAge);
        System.out.println("----------------------------");
        legalAge(true);
    }
    public static int myAge(int year, int yob, int age){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        year = in.nextInt();
        System.out.print("Enter your yob: ");
        yob = in.nextInt();
        age = year - yob;
        return age;
    }
    public static boolean legalAge(boolean ofAge){
        if(ofAge){
            System.out.println("You can drink!");
        }
        return false;
    }
}
