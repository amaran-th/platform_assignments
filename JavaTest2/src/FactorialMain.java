//과제2-1
import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.printf("Factorial of %d = %d\n",i,getFactorial(i));
        }
    }
    private static long getFactorial(final int n){
        if(n==1||n==0) return 1;
        else{
            return getFactorial(n-1)*n;
        }
    }
}
