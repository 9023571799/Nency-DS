import java.util.Scanner;
import java.util.Stack;

class String_Palindrome{
    int top=0,n,i;
    int arr[];

    String_Palindrome(){
    arr=new int[n];
    this.n=n;
    top=-1;
    }

public void checkPalindrome(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    char [] str=sc.next().toCharArray();  
    Stack <Character> stc =new Stack<>();

    while(str[i]!='c'){
    stc.push(str[i]);
    i++;
    System.out.println(stc);
}
    i++;
    for(int i=str[i]+1;i<=str){
    System.out.println(stc);

    if(stc.isEmpty()){
    System.out.println("Stack is empty");
}
    else if(stc.pop()!=stc.push(str.charAt(i))){
    System.out.println("Elements are no equal");
}
    else{    
    System.out.println("it's a Palindrom");
}
}
}
}
// }
public class Recognise{
    public static void main(String[] args){
// //         
// //         
    int n=10;
    String_Palindrome obj=new String_Palindrome();
    obj.checkPalindrome();
    }


}
