import java.util.*;
public class P8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter name, fromCity, viaCity, toCity");
String name=sc.nextLine();
String fromCity=sc.nextLine();
String viaCity=sc.nextLine();
String toCity=sc.nextLine();

System.out.println("Enter distances fromToVia and viaToFinalCity in miles and time in hours and minutes");
double distanceFromToVia=sc.nextDouble();
double distanceViaToFinal=sc.nextDouble();
int timeFromToViaHour=sc.nextInt();
int timeFromToViaMinutes=sc.nextInt();
int timeViaToFinalHour=sc.nextInt();
int timeViaToFinalMinutes=sc.nextInt();

int timeFromToVia=timeFromToViaHour*60+timeFromToViaMinutes;
int timeViaToFinal=timeViaToFinalHour*60+timeViaToFinalMinutes;

double totalDistance=distanceFromToVia+distanceViaToFinal;
int totalTime=timeFromToVia+timeViaToFinal;

System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}

