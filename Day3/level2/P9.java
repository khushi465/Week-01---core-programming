import java.util.*;
public class P9{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of students");
int num=sc.nextInt();
int marks[][]=new int[num][3];
double percentage[]=new double[num];
char grade[]=new char[num];
for(int i=0;i<num;i++){
System.out.println("Enter marks for student "+(i+1));
 marks[i][0]=sc.nextInt();
marks[i][1]=sc.nextInt();
marks[i][2]=sc.nextInt();
if(marks[i][0]<0||marks[i][1]<0||marks[i][2]<0){
	System.out.println("Invalid marks try again");
	i--;
}}
for(int i=0;i<num;i++){
	
percentage[i]=(double)(marks[i][0]+marks[i][1]+marks[i][2])/3;
if(percentage[i]>=80){
	grade[i]='A';
}
else if(percentage[i]>=70&&percentage[i]<=79){
	grade[i]='B';
}
else if(percentage[i]>=60&&percentage[i]<=69){
	grade[i]='C';
}
else if(percentage[i]>=50&&percentage[i]<=59){
	grade[i]='D';
}
else if(percentage[i]>=40&&percentage[i]<=49){
	grade[i]='E';
}
else{
grade[i]='R';}
System.out.print("Student "+(i+1)+": Physics: "+marks[i][0]+" Chemistry: "+marks[i][1]+" Maths: "+marks[i][2]);
System.out.println("  Percentage: "+percentage[i]+" Grade: "+grade[i]);
}
}
}