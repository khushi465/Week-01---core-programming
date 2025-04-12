import java.util.*;
public class P9{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student Fee and University Discount");
double fee=sc.nextInt();
int discountPercent=sc.nextInt();

double discount=(double)discountPercent/100*fee;
double finalFee=fee-discount;

System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+finalFee);
}}
