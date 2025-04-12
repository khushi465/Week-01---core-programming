import java.util.*;
public class P8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of students");
int num=sc.nextInt();
int phy[]=new int[num];
int chem[]=new int[num];
int maths[]=new int[num];
double percentage[]=new double[num];
char grade[]=new char[num];
for(int i=0;i<num;i++){
System.out.println("Enter marks for student "+(i+1));
phy[i]=sc.nextInt();
chem[i]=sc.nextInt();
maths[i]=sc.nextInt();
if(phy[i]<0||chem[i]<0||maths[i]<0){
	System.out.println("Invalid marks try again");
	i--;
}}
for(int i=0;i<num;i++){
percentage[i]=(double)(phy[i]+chem[i]+maths[i])/3;
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
System.out.print("Student "+(i+1)+": Physics: "+phy[i]+" Chemistry: "+chem[i]+" Maths: "+maths[i]);
System.out.println("  Percentage: "+percentage[i]+" Grade: "+grade[i]);
}
}
}