package com.blackflower.thirdlab;

public class ThirdLab {

    public static void main(String[] args) {
        
        int num = -28;        
        System.out.println("Number value is: " + NumberValue(num));
        
        System.out.println("Rounded version of " + num + " is: " + RoundInt(num));
        
        System.out.println("The Biggest Number is: " + FindTheBiggest(15, 8, 7));
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
}
