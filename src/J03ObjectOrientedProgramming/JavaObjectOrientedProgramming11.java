package J03ObjectOrientedProgramming;

import java.util.Scanner;

/*
Write a Java program to to input principle, time and rate (P, T, R) from user and find Simple Interest (SI).
SI = (principle * time * rate) / 100
Example:
For principle = 1000, time = 2, rate = 5 the output value is 100.00
Input: principle, time and rate
Output: the Simple Interest
Execution time limit: 1 second
 */
public class JavaObjectOrientedProgramming11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double principle = reader.nextDouble();
        int time = reader.nextInt();
        double rate = reader.nextDouble();
        SimpleInterest11 si = new SimpleInterest11();
        si.setPrinciple(principle);
        si.setTime(time);
        si.setRate(rate);
        System.out.println(si.getSimpleInterest());
    }
}

class SimpleInterest11 {
    private double principle;
    private int time;
    private double rate;

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSimpleInterest() {
        return (principle * time * rate) / 100;
    }
}
