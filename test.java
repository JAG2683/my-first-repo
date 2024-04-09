import java.util.Scanner;
public class test{
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        double num1 = scnr.nextDouble();

        int result = (int) Math.sqrt(num1);

        System.out.println("the result is " + result);

        scnr.close();
    
    }
}

