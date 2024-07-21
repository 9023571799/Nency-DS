import java.util.Scanner;
import java.util.Stack;
public class AEqualsB {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        Stack <Character> st=new Stack<>();
        // int Top=1;
        int i=0;

        while(str.charAt(i)!='c'){
            st.push(str.charAt(i));
            i++;
        }
        i++;
    }
}
