import java.util.*;
public class P3 {
    int calculateHandshakes(int nos){
        int handshakes=(nos*(nos-1))/2;
        return handshakes;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int numberOfStudents=sc.nextInt();
        P3 obj=new P3();
        int numberOfHandshakes=obj.calculateHandshakes(numberOfStudents);
   
        System.out.println("The maximum number of handshakes among "+numberOfStudents+" is "+numberOfHandshakes);
        }
}
