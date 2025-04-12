import java.util.*;
public class P16{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of students");
	int numberOfStudents=sc.nextInt();

	int numberOfHandshakes=(numberOfStudents*(numberOfStudents-1))/2;

	System.out.println("The maximum number of handshakes among "+numberOfStudents+" is "+numberOfHandshakes);
	}
}
