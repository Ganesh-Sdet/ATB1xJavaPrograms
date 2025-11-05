package Oct.ex_24102024;

import java.util.Scanner;

public class Lab117 {
    public static void main(String[] args) {
        //Create a function of sub, Sum, Mul & div
        //With Parameter a,b(take the parameter from the user)

        //3-> User Input
        //4-> User Input
        //Sum(3,4)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = scanner.nextInt();
        System.out.println("Enter the num2");
        int b = scanner.nextInt();

        int result = sum_of_numbers(a,b);
        System.out.println("Sum is-> " +result);
        
        int sub_result = sub_of_result(a,b);
        System.out.println("Sub is-> " +sub_result);

        int mul_result = mul_of_result(a,b);
        System.out.println("Mul is-> " +mul_result);

        int mod_result = mod_of_result(a,b);
        System.out.println("Mod is-> " +mod_result);
        
//        Scanner.close();

    }

    static int mod_of_result(int a, int b) {
        return a%b;
    }

    static int mul_of_result(int a, int b) {
        return a*b;
    }

    static int sub_of_result(int a, int b) {
        return a-b;
    }

    static int sum_of_numbers(int a, int b){
        return a+b;
    }

}
