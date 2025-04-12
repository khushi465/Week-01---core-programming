public class P6{
public static void main(String[] args){
int fee=125000;
int discountPercent=10;

double discountAmount=(double)discountPercent/(double)100*fee;
double discountedPrice=(double)fee-discountAmount;

System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedPrice);
}}