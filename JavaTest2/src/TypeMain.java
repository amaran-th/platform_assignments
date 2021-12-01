//실습 2-1
import java.util.Scanner;

public class TypeMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        printType(input);
        System.out.println("Type conversion to int...");
        int n_i=Integer.parseInt(input);
        printType(n_i);
        System.out.println("Type conversion int to float...");
        float n_f=(float)n_i;
        printType(n_f);

        scanner.close();
    }
    private static void printType(String x) {
        System.out.println(x + " is a string");
    }
    private static void printType(int x) {
        System.out.println(x + " is an int");
    }
    private static void printType(float x) {
        System.out.println(x + " is a float");
    }
}
