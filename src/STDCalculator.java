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

     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the STD calculator; ");
        System.out.println("please enter the number of inputs you wish to average:");
         // defines the size of the array, and gathers doubles for the array.
        int size = keyboard.nextInt();
        double [] input = new double[size];
        System.out.println("Enter " + input.length + " values/scores:");
         for (int index = 0; index < input.length; index++) {
             input[index] = keyboard.nextDouble();}
         // first calculate the average; then pass it to a print; avoids running the
         // code twice on both like 32/33
        double average = calcMean(input);
        System.out.println("The average is:" + average);
        System.out.println("The STD is:" +calcSTD(input,average));
    }
    public static double calcMean(double [] input) {
        // first we calculate the mean, this is important calculating the variance ( a method
        // that needs to be used to figure out STD)
        double sum = 0;
        for(int index =0; index<input.length; index++){
            sum = sum + input[index];
        }
        double average = sum / input.length;
        return average;
    }

    public static double calcSTD(double[] input, double average) {
        // a concept easily worked out on paper; but can be hidden in a loop. The first step is to calculate variance,
        // and add them all together; the std is then the sqroot of the sum of the variances.
        double sqSum = 0;
        double std = 0;
        for (int index = 0; index < input.length; index++) {
            sqSum = sqSum + Math.pow((input[index] - average), 2);
        }
        std = Math.pow((sqSum / input.length), .5);
        return std;
    }
}

// for(int std :std){
//System.out.print(score+"")
//}