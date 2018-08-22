package com.company;

import java.util.PropertyPermission;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int a = scanner.nextInt();

        String aNumber = Integer.toString(a);
        char[] aNumberArray = aNumber.toCharArray();
        switch (aNumberArray.length){
            case 1:{
                System.out.println(single(Integer.parseInt(String.valueOf(aNumberArray[0]))));
                break;
            }
            case 2:{
                System.out.println(doubleNumber(Integer.parseInt(String.valueOf(aNumberArray[0])), Integer.parseInt(String.valueOf(aNumberArray[1]))));
                break;
            }
            case 3:{
                System.out.println(tripple(Integer.parseInt(String.valueOf(aNumberArray[0])), Integer.parseInt(String.valueOf(aNumberArray[1])), Integer.parseInt(String.valueOf(aNumberArray[2]))));
                break;
            }
        }
    }

    private static String single(int a){
        switch (a){
            case 0:{
                return "zero";
            }
            case 1:{
               return "one";
            }
            case 2:{
                return "two";
            }
            case 3:{
               return "three";
            }
            case 4:{
                return "four";
            }
            case 5:{
                return "five";
            }
            case 6:{
                return "six";
            }
            case 7:{
               return "seven";
            }
            case 8:{
                return "eight";
            }
            case 9:{
                return "nine";
            }
            default:{
                return "zero";
            }
        }
    }

    private static String doubleNumber(int a, int b){
        switch (a){
            case 1:{
                switch (b){
                    case 0:{
                        return "ten";
                    }
                    case 1:{
                        return "eleven";
                    }
                    case 2:{
                        return "twelve";
                    }
                    case 3:{
                        return "thirdteen";
                    }
                    case 4:{
                        return "fourthteen";
                    }
                    case 5:{
                        return "fifthteen";
                    }
                    case 6:{
                        return "sixthteen";
                    }
                    case 7:{
                        return "seventhteen";
                    }
                    case 8:{
                        return "eighthteen";
                    }
                    case 9:{
                        return "ninethteen";
                    }
                    default:{
                        return "eleven";
                    }
                }
            }
            case 2:{
                if(b==0){
                    return "twenty";
                }else{
                    return ("Twenty"+single(b));
                }
            }
            case 3:{
                if(b==0){
                    return "thirty";
                }else{
                    return ("thirty"+single(b));
                }
            }
            case 4:{
                if(b==0){
                    return "fourty";
                }else{
                    return ("fourty"+single(b));
                }
            }
            case 5:{
                if(b==0){
                    return "fifty";
                }else{
                    return ("fifty"+single(b));
                }
            }
            case 6:{
                if(b==0){
                    return "sixty";
                }else{
                    return ("sixty"+single(b));
                }
            }
            case 7:{
                if(b==0){
                    return "seventy";
                }else{
                    return ("seventy"+single(b));
                }
            }
            case 8:{
                if(b==0){
                    return "eighty";
                }else{
                    return ("eighty"+single(b));
                }
            }
            case 9:{
                if(b==0){
                    return "ninety";
                }else{
                    return ("ninety"+single(b));
                }
            }
            default:{
                return "ten";
            }
        }
    }

    private static String tripple(int a, int b, int c){
        switch (a){
            case 1:{
                if(b==0){
                    if(c==0){
                        return "one hundred";
                    }else {
                        return ("one hundred" + "and" + single(c));
                    }
                }else{
                    return ("one hundred"+doubleNumber(b,c));
                }
            }
            case 2:{
                if(b==0){
                    if(c==0){
                        return "two hundred";
                    }else{
                        return ("two hundred"+"and"+single(c));
                    }
                }else{
                    return ("two hundred"+doubleNumber(b,c));
                }
            }
            case 3:{
                if(b==0){
                    if(c==0){
                        return "three hundred";
                    }else{
                        return ("three hundred" + "and" +single(c));
                    }
                }else{
                    return ("three hundred"+doubleNumber(b,c));
                }
            }
            case 4:{
                if(b==0){
                    if(c==0){
                        return "four hundred";
                    }else{
                        return ("four hundred"+"and"+single(c));
                    }
                }else{
                    return ("four hundred"+doubleNumber(b,c));
                }
            }
            case 5:{
                if(b==0){
                    if(c==0){
                        return "five hundred";
                    }else{
                        return ("five hundred"+"and"+single(c));
                    }
                }else{
                    return ("fine hundred"+doubleNumber(b,c));
                }
            }
            case 6:{
                if(b==0){
                    if(c==0){
                        return "six hundred";
                    }else{
                        return ("six hundred"+"and"+single(c));
                    }
                }else{
                    return ("six hundred"+doubleNumber(b,c));
                }
            }
            case 7:{
                if(b==0){
                    if(c==0){
                        return "seven hundred";
                    }else{
                        return ("seventy"+"and"+single(c));
                    }
                }else{
                    return ("seventy"+doubleNumber(b,c));
                }
            }
            case 8:{
                if(b==0){
                    if(c==0){
                        return "eight hundred";
                    }else{
                        return ("eight hundred"+"and"+single(c));
                    }
                }else{
                    return ("eight hundred"+doubleNumber(b,c));
                }
            }
            case 9:{
                if(b==0){
                    if(c==0){
                        return "nine hundred";
                    }else{
                        return ("nine hundred"+"and"+single(c));
                    }
                }else{
                    return ("nine hundred"+doubleNumber(b,c));
                }
            }
            default:{
                return ("one hundred");
            }
        }
    }
}
