//실습 2-3
import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int input1=scanner.nextInt();
        int input2=scanner.nextInt();

        System.out.printf("%d / %d = %.3f\n", input1,input2,(float)input1/input2);
        System.out.printf("%d = %d x %d + %d\n", input1, input1/input2, input2, input1%input2);

        scanner.close();
    }
}
