import java.util.Scanner;

/**
 * Write a description of class Diposit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Diposit
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter principal: ");
        double P= s.nextDouble();
        System.out.print("Enter annual rate(%): ");
        double r= s.nextDouble();
        System.out.print("Enter months: ");
        int m= s.nextInt();
        double mRate= r/12/100;
        double interest= P+mRate*m;
        double fee= P*0.005;
        double fAmount= P+interest-fee;
        System.out.println("Final Amount= "+fAmount);
    }
}