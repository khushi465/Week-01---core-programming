import java.util.*;
public class P1 {

    double calculateSI(double p, int r, int t){
        double simpleInterest=p*r*t/100;
        return simpleInterest;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle, rate and time");
        double principle=sc.nextDouble();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        P1 obj=new P1();
       double SI=obj.calculateSI(principle, rate, time);
        System.out.println("The Simple Interest is "+SI+" for Principle "+principle+", Rate of interest "+rate+" and Time "+time);
    }
}
