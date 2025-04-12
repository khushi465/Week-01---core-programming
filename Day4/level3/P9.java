import java.util.*;
public class P9 {

    public double calcDistance(int x1, int y1, int x2, int y2){
       double distance=Math.sqrt((Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))));
        return distance;
    }
    public double[] findEq(int x1, int y1, int x2, int y2){
       double m=(double)(y2-y1)/(x2-x1);
       double b=y1-m*x1;
       double arr[]={m,b};
       return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of 1st and 2nd point");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        P9 obj=new P9();
        double distance=obj.calcDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance: "+distance);
        double arr[]=obj.findEq(x1, y1, x2, y2);
        System.out.println("y="+arr[0]+"x+"+arr[1]);
    }
}
