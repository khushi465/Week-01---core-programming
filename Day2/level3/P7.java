import java.util.*;
public class P7{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter weight in kg and height in cm");
double weight=sc.nextDouble();
double height=sc.nextDouble();
height=height/100;
double BMI=weight/(height*height);
//System.out.println(BMI);
if(BMI<=18.4){
System.out.println("Underweight");
}
else if(BMI>=18.5&&BMI<=24.9){
System.out.println("Normal");
}
else if(BMI>=18.5&&BMI<=24.9){
System.out.println("Overweight");
}
else{
System.out.println("Obese");
}
}}