import java.util.Scanner;

public class STDCalculator{

    static double[] input;
    static Scanner keyboard = new Scanner(System.in);
    static double average = -100;
    static double std = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the STD calculator; ");
        System.out.println("please enter the number of inputs you wish to average:");
        int size = keyboard.nextInt();
        input = new double[size];
        calcMean();
        calcSTD();
    }
    public static void calcMean() {
        System.out.println("Enter " + input.length + " values/scores:");
        double sum = 0;
        for (int index = 0; index < input.length; index++) {
            input[index] = keyboard.nextDouble();
            sum = sum + input[index];
        }
        average = sum / input.length;
        System.out.println("Average is:" + average);
    }

    public static void calcSTD() {
        double sqSum = 0;
        for (int index = 0; index < input.length; index++) {
            sqSum = sqSum + Math.pow((input[index] - average), 2);
        }
        std = Math.pow((sqSum / input.length), .5);
        System.out.println("Your standard Div is " + std);
    }
}
