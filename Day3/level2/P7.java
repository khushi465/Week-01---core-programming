import java.util.*;
public class P7{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of people");
int num=sc.nextInt();
double data[][]=new double[10][3];
String status[]=new String[num];
for(int i=0;i<num;i++){
	System.out.println("Enter weight in kg and height in cm of person "+(i+1));
	data[i][0]=sc.nextDouble();
	data[i][1]=sc.nextDouble();
	if(data[i][0]<0||data[i][1]<0){
	System.out.println("Retry. Negative value found");
	i--;}
}
for(int i=0;i<num;i++){
data[i][1]=data[i][1]/100;
data[i][2]=data[i][0]/(data[i][1]*data[i][1]);
//System.out.println(BMI);
if(data[i][2]<=18.4){
status[i]="Underweight";
}
else if(data[i][2]>=18.5&&data[i][2]<=24.9){
status[i]="Normal";
}
else if(data[i][2]>=18.5&&data[i][2]<=24.9){
status[i]="Overweight";
}
else{
status[i]="Obese";
}
}
for(int i=0;i<num;i++){
System.out.println("Person "+i+": Weight="+data[i][0]+"kg, Height="+(data[i][1]*100)+"cm, BMI="+data[i][2]+" and Status="+status[i]);
}
}}