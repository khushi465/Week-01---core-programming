import java.util.*;
public class P1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter salary and year of service of 10 employees");
double oldSal[]=new double[10];
int year[]=new int[10];
for(int i=0;i<10;i++){
	System.out.println("Salary and years of employee "+(i+1));
	oldSal[i]=sc.nextDouble();
	year[i]=sc.nextInt();
	if(oldSal[i]<0||year[i]<0){
		i--;
	}
}
double bonusAmount[]=new double[10];
double newSal[]=new double[10];
double totalBonus=0, totalOldSal=0, totalNewSal=0;

for(int i=0;i<10;i++){
	if(year[i]>=5){
		bonusAmount[i]=oldSal[i]*(double)5/100;
}
else{
	bonusAmount[i]=oldSal[i]*(double)2/100;
}
newSal[i]=oldSal[i]+bonusAmount[i];
totalBonus+=bonusAmount[i];
totalOldSal+=oldSal[i];
totalNewSal+=newSal[i];
}
System.out.println("Total bonus: "+totalBonus);
System.out.println("Total Old Salary: "+totalOldSal);
System.out.println("Total New Salary: "+totalNewSal);

}}