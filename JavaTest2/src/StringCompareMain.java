//실습2-4
/*
-한 줄을 문자열로 입력 받을 때는 Scanner의 nextLine() 메서드를 사용할 수 있습니다.
-모든 문자를 대문자 또는 소문자로 바꾸고 싶다면 각각 toUpperCase(),  toLowerCase() 메서드를 사용하여 변경할 수 있습니다.
-알파벳 대소문자를 구분 없이 비교하고 싶다면 문자열을  equalsIgnoreCase() 메서드를 사용하면 됩니다.
-문자열을 치환하고 싶을 때는 String 의 replace() 또는 replaceAll() 메서드를 사용할 수 있습니다.
*/

import java.util.Locale;
import java.util.Scanner;

public class StringCompareMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String input1=scanner.nextLine();
        String input2=scanner.nextLine();

        if(input1.equals(input2)) System.out.println("true");
        else System.out.println("false");


        if(input1.equalsIgnoreCase(input2)) System.out.println("true");
        else System.out.println("false");


        if(input1.equals(input2.toLowerCase(Locale.ROOT))) System.out.println("true");
        else System.out.println("false");


        String changed_input1=input1.replace("easy","fun");


        if(changed_input1.equals(input2.toLowerCase(Locale.ROOT))) System.out.println("true");
        else System.out.println("false");


        scanner.close();
    }
}
