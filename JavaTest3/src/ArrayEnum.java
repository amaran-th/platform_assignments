import java.util.Scanner;
enum Command {ADD, LIST, AVG, SUM, STD, QUIT, INVALID};

public class ArrayEnum {
    public static void main(String[] args){
        int[] values=new int[100];
        int index=0;
        final Scanner scanner = new Scanner(System.in);

        while(true){
            final Command command=getCommand(scanner);
            if(command==Command.QUIT){
                System.out.println("Bye!");
                scanner.close();
                break;
            }
            switch(command){
                case ADD:
                    final int newValue=getValue(scanner);
                    values[index]=newValue;
                    index++;
                    break;
                case LIST:
                    printList(values,index);
                    break;
                case AVG:
                    System.out.printf("%.2f%n",getAvg(values,index));
                    break;
                case SUM:
                    System.out.printf("%d%n",getSum(values,index));
                    break;
                case STD:
                    System.out.printf("%.2f%n",getStd(values,index));
                    break;
                case INVALID:
                    System.out.printf("Invalid Command%n");
                    break;
            }
        }
        scanner.close();
    }
    private static Command getCommand(Scanner scanner){
        final String Cmd=scanner.next();
        Command command;
        try{
            command=Command.valueOf(Cmd.toUpperCase());
        }catch (IllegalArgumentException e){command=Command.INVALID;}
        return command;
    }
    private static int getValue(Scanner scanner){
        final int value=scanner.nextInt();
        return value;
    }
    private static void printList(int values[], int index){
        for(int i=0;i<index;i++){
            System.out.printf("%d ",values[i]);
        }
        System.out.printf("%n");
    }
    private static double getAvg(int values[], int index){
        return (double)getSum(values,index)/index;
    }
    private static int getSum(int values[], int index){
        int result=0;
        for(int i=0;i<index;i++){
            result+=values[i];
            //System.out.printf("%d ",values[i]);
        }
        return result;
    }
    private static double getStd(int values[], int index){
        double avg=getAvg(values,index);
        double result=0;
        for(int i=0;i<index;i++){
            result+=Math.pow(values[i]-avg,2);
        }
        return Math.sqrt((double)result/index);
    }
}
