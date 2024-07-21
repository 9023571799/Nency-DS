import java.util.Scanner;
public class AreaOfCircle{
public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    double radius=sc.nextDouble();
    System.out.println("Enter Radius: ");
    double area = Math.PI*radius*radius;
    System.out.println("Area of circle: "+area);
}
}