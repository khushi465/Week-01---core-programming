import java.util.*;
public class P3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter physics, chemistry and maths marks");
int phy=sc.nextInt();
int chem=sc.nextInt();
int maths=sc.nextInt();
int percentage=(phy+chem+maths)/3;

if(percentage>=80){
System.out.println("Percentage: "+percentage+"\nGrade: A\nRemarks: Level 4, above agency-normalized standards" );
}
else if(percentage>=70&&percentage<=79){
System.out.println("Percentage: "+percentage+"\nGrade: B\nRemarks: Level 3, at agency-normalized standards" );
}
else if(percentage>=60&&percentage<=69){
System.out.println("Percentage: "+percentage+"\nGrade: C\nRemarks: Level 2, below, but approaching agency-normalized standards" );
}
else if(percentage>=50&&percentage<=59){
System.out.println("Percentage: "+percentage+"\nGrade: D\nRemarks: Level 1, well below agency-normalized standards" );
}
else if(percentage>=40&&percentage<=49){
System.out.println("Percentage: "+percentage+"\nGrade: E\nRemarks: Level 1-, too below agency-normalized standards" );
}
else{
System.out.println("Percentage: "+percentage+"\nGrade: R\nRemarks:  Remedial standards" );
}
}}