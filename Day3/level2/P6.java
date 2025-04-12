import java.util.*;
public class P6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of people");
int num=sc.nextInt();
double weight[]=new double[num];
double height[]=new double[num];
double bmi[]=new double[num];
String status[]=new String[num];
for(int i=0;i<num;i++){
	System.out.println("Enter weight in kg and height in cm of person "+(i+1));
	weight[i]=sc.nextDouble();
	height[i]=sc.nextDouble();
}
for(int i=0;i<num;i++){
height[i]=height[i]/100;
bmi[i]=weight[i]/(height[i]*height[i]);
//System.out.println(BMI);
if(bmi[i]<=18.4){
status[i]="Underweight";
}
else if(bmi[i]>=18.5&&bmi[i]<=24.9){
status[i]="Normal";
}
else if(bmi[i]>=18.5&&bmi[i]<=24.9){
status[i]="Overweight";
}
else{
status[i]="Obese";
}
}
for(int i=0;i<num;i++){
System.out.println("Person "+i+": Weight="+weight[i]+"kg, Height="+(height[i]*100)+"cm, BMI="+bmi[i]+" and Status="+status[i]);
}
}}