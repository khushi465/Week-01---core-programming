import java.util.*;
public class P9{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows and columns");
int rows=sc.nextInt();
int cols=sc.nextInt();
System.out.println("Enter array elements");
int array2d[][]=new int[rows][cols];
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		array2d[i][j]=sc.nextInt();
	}
}
int array1d[]=new int[rows*cols];
int k=0;
System.out.println("2d Array");
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		System.out.print(array2d[i][j]+" ");
	}
	System.out.println();
}
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		array1d[k]=array2d[i][j];
		k++;
	}
}
System.out.println("2d Array");
for(int i=0;i<k;i++){
	System.out.println(array1d[i]+" ");
}
}}