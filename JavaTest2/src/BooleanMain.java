//실습2-2
import java.util.Scanner;

public class BooleanMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean bool=false;
        String input1=scanner.next();
        String input2=scanner.next();

        int n1=Integer.parseInt(input1);
        int n2=Integer.parseInt(input2);

        System.out.printf("Number1 : %d, Number2 : %d\n", n1,n2);

        if(n1>n2) bool=true;
        System.out.printf("Number1 > Number2 ? %b\n", bool);
        if(n1<n2) bool=true;
        else bool=false;
        System.out.printf("Number1 < Number2 ? %b\n", bool);
        if(n1==n2) bool=true;
        else bool=false;
        System.out.printf("Number1 == Number2 ? %b\n", bool);


        scanner.close();
    }

}
