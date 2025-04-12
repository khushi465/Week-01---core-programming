import java.util.*;
public class P7{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter month and day");
int month=sc.nextInt();
int day=sc.nextInt();

if((month>3&&month<6)||(month==3&&day>=20)||(month==6&&day<=20)){
System.out.println("Its a Spring season");
}
else{
System.out.println("Its not a Spring season");
}
}
}