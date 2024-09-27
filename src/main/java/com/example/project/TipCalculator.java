package com.example.project;
import java.text.DecimalFormat;

public class TipCalculator 
{
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) 
    {   
        //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        DecimalFormat formatting = new DecimalFormat("#.##");
        // DecimalFormat converts it to a string so it can be rounded to the hundredths place
        // I reconvert the rounded string back into double type by parsing

        String tipAmountString = formatting.format(cost * (percent / 100.0));
        Double tipAmount = Double.parseDouble(tipAmountString);
        // tippedAmount is the tip amount

        String totalString = formatting.format(tipAmount + cost);
        double total = Double.parseDouble(totalString);
        // total is the cost of the bill after the tip is factored in

        String perPersonCost = formatting.format(cost / people);
        // perPersonCost is the cost per person before tip
        String perPersonTip = formatting.format(tipAmount / people);
        // perPersonTip is the tip given by each person
        String perPersonTotal = formatting.format(((cost * (percent / 100.0)) + cost) / people);
        // perPersonTotal is the cost per person after tip 
        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: $" + tipAmount + "\n");
        result.append("Total Bill with tip: $" + total + "\n");
        result.append("Per person cost before tip: $" + perPersonCost + "\n");
        result.append("Tip per person: $" + perPersonTip + "\n");
        result.append("Total cost per person: $" + perPersonTotal + "\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
    
     //TEST YOUR PROGRAM IN main
    public static void main(String[] args) 
    {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people ,percent, cost));
    }
}

// Sources 
// https://stackoverflow.com/questions/19008970/java-what-does-n-mean
// (Found that \n makes a new line)
