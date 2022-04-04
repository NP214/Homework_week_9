package calculate;

public class Calculator {
    int addresult, subresult, multresult, divresult;

    public void addition(int a, int b) {

        System.out.println("addition of " + a + " and " + b + " is : " + addresult);
    }

    public void subtraction(int a, int b) {
        System.out.println("subtraction of " + a + " and " + b + " is : " + subresult);
    }

    public void division(int a, int b) {
        System.out.println("division of " + a + " and " + b + " is : " + divresult);
    }

    public void multiplication(int a, int b) {
        System.out.println("multiplication of " + a + " and " + b + " is : " + multresult);
    }

    public int calculateResult(int a, int b, char symbol) {

        if (symbol == '+') {
            addresult = a + b;
            return addresult;
        } else if (symbol == '-') {
            subresult = a - b;
            return subresult;
        } else if (symbol == '*') {
            multresult = a * b;
            return multresult;
        } else {
            divresult = a / b;
            return divresult;
        }

    }
}


