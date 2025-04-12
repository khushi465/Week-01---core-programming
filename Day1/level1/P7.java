public class P7{
public static void main(String[] args){
int radiusInKm=6378;

double radiusInMiles=radiusInKm/1.6;
double volInKm=(double)4/3*3.14*Math.pow(radiusInKm,3);
double volInMiles=(double)4/3*3.14*Math.pow(radiusInMiles,3);

System.out.println("The volume of earth in cubic kilometers is "+volInKm+" and cubic miles is "+volInMiles);
}}