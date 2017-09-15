/*
(Statistics: compute mean and standard deviation) In business applications, you
are often asked to compute the mean and standard deviation of data. The mean is
simply the average of the numbers. The standard deviation is a statistic that tells
you how tightly all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the
ages? If all the students are the same age, the deviation is 0.
 Write a program that prompts the user to enter ten numbers, and displays the
mean and standard deviations of these numbers using the following formula:

@Author Ryan Pletzer
All rights reserved;
@Csc 201
 */
import java.util.Scanner;

public class STDCalculator{
// Assigning global variables, and putting the input into an array.
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
        // first we calculate the mean, this is important calculating the variance ( a method
        // that needs to be used to figure out STD)
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
        // a concept easily worked out on paper; but can be hidden in a loop. The first step is to calculate variance,
        // and add them all together; the std is then the sqroot of the sum of the variances.
        double sqSum = 0;
        for (int index = 0; index < input.length; index++) {
            sqSum = sqSum + Math.pow((input[index] - average), 2);
        }
        std = Math.pow((sqSum / input.length), .5);
        System.out.println("Your standard Div is " + std);
    }
}
