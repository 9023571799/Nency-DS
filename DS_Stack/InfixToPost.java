import java.util.Scanner;
import java.util.Stack;
class fix{
int top=-1;
String [] str;


public void scanInfix(){
// char chr=sc.next().charAt(0)
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String str=sc.nextLine();
    Stack st=new Stack();

}

public void inToPost(){
    char symbol;
    for(int i=0;i<str.length;i++){
       System.out.println("hello");
    }
}
}

public class InfixToPost {
    public static void main(String[] args){
        fix obj=new fix();
        obj.scanInfix();
        obj.inToPost();
    }
}
