import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;

    public static double power(double num1,double num2){
        return Math.pow(num1,num2);
    }
    public static int power(int num1,int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println(Calculator.power(2,8));
        System.out.println(Calculator.power(10.0,10.0));
    }

}
