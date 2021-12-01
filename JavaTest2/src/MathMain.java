//과제 2-2
import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a begin number: ");
        int begin=scanner.nextInt();
        System.out.printf("Enter an end number: ");
        int end=scanner.nextInt();


        long sum=getSumBetween(begin,end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);

        long product=getProductBetween(begin,end);
        System.out.printf("Product between %d and %d : %,d%n",begin,end,product);
    }

    private static long getSumBetween(final int begin, final int end){
        long sum=0;
        for(int i=begin;i<=end;i++){
            sum+=i;
        }
        return sum;
    }

    private static long getProductBetween(final int begin, final int end){
        long sum=1;
        for(int i=begin;i<=end;i++){
            sum*=i;
        }
        return sum;
    }
}
