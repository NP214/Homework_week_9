package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Please enter one of symbol +,-,*,/ :");
        char symbol = sc.next().charAt(0);
        obj1.calculateResult(a,b,symbol);
        while (obj1.addresult != 0){
            obj1.addition(a,b);
            System.out.println("Would you like to do \n" +"more calculation Please enter “Y” or “N” :");
            String c = sc.next();
            if(c == "y") {

                    System.out.println("Enter first number :");
                    a = sc.nextInt();
                    System.out.println("Enter second number :");
                    b = sc.nextInt();
                    System.out.println("Please enter one of symbol +,-,*,/ :");
                    symbol = sc.next().charAt(0);
                    obj1.calculateResult(a, b, symbol);
                    obj1.addition(a, b);
                    obj1.subtraction(a, b);
                    obj1.division(a, b);
                    obj1.multiplication(a, b);

        }


        obj1.subtraction(a,b);
        obj1.division(a,b);
        obj1.multiplication(a,b);
}
}}
