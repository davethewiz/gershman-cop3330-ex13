/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

public class App 
{
    public static double CalcCompInterest(double P, double r, double t, double n) {
        return P * Math.pow(1 + r / n, n*t);
    }

    public static void main( String[] args )
    {
        double principal = Input.GetDouble("What is the principal amount? ");
        double roi = Input.GetDouble("What is the rate? ");
        double years = Input.GetDouble("What is the number of years? ");
        double compound = Input.GetDouble("What is the number of times the interest is compounded per year? ");

        double finalVal = CalcCompInterest(principal, roi / 100d, years, compound);
        finalVal = Math.round(finalVal * 100) / 100d;

        System.out.printf("$%.0f invested at %.1f%% for %.0f years compounded %.0f times per year is $%.2f.", principal, roi, years, compound, finalVal);
    }
}
