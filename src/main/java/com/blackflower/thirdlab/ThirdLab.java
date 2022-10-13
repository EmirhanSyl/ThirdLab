package com.blackflower.thirdlab;

public class ThirdLab {

    public static void main(String[] args) {
        
        int num = -28;        
        System.out.println("Number value is: " + NumberValue(num));
        
        System.out.println("Rounded version of " + num + " is: " + RoundInt(num));
        
        System.out.println("The Biggest Number is: " + FindTheBiggest(15, 8, 7));
        
        System.out.println("85 is : " + FindDivisibles(85));
        
        System.out.println("Biggest Divisor is: " + BiggestDivisor(8, 6));        
        System.out.println("Biggest Divisor is: " + FindBiggestDivisorBetterWay(6, 8));

    }
    
    public static String NumberValue(int num){
        String result;
        
        if (num < 10) {
            result = "small";
        }
        else if(num < 20){
            result = "normal";
        }
        else{
            result = "Very High";
        }
        
        return result;
    }
    
    public static int RoundInt(int num){
        int lastDigit = num % 10;
        
        if (lastDigit < 5) {
            num -= lastDigit;
        }
        else{
            num += (10 - lastDigit);
        }
        
        return num;
    }
    
    public static int FindTheBiggest(int num1, int num2, int num3){
        int maxNum = num1;
        
        if (maxNum < num2) {
            maxNum = num2;
        }
        
        if (maxNum < num3) {
            maxNum = num3;
        }
        
        return maxNum;
    }
    
    public static String FindDivisibles(int num){
        
        String result;
        if (num % 10 == 0) {
            result = "Divisible by both 5 and 2";
        }
        else if (num % 5 == 0) {
            result = "Divisible by 5";
        }
        else if (num % 2 == 0) {
            result = "Divisible by 2";
        }
        else{
            result = "Divisible by neither 5 or 2";
        }
        
        return result;
    }
    
    public static void FindDiscountAmount(int price){
        int discountAmount;
        
        if (price < 200) {
            discountAmount = 10;
        }
        else if (price < 400) {
            discountAmount = 15;
        }
        else{
            discountAmount = 20;
        }
        
        double result = (100 - discountAmount);
    }
    
    public static int BiggestDivisor(int num1, int num2){

        int biggestDivisor = 1;
        
        if (num1 % 4 == 0  || num2 % 4 == 0) {
            biggestDivisor = 4;
        }
        else if (num1 % 3 == 0  || num2 % 3 == 0) {
            biggestDivisor = 3;
        }
        else if (num1 % 2 == 0  || num2 % 2 == 0) {
            biggestDivisor = 2;
        }
        
        return biggestDivisor;
    }
    
    public static int FindBiggestDivisorBetterWay(int num1, int num2){
        
        int maxDevisor = 1;
        
        for (int i = 1; i < 5; i++) {
            if (num1 % i == 0 || num2 % i == 0) {
                maxDevisor = i;
            }
        }
        
        return maxDevisor;
    }
}
