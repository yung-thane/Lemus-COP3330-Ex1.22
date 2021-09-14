/*
 *  UCF COP3330 Fall 2021 Assignment 1.18 Solution
 *  Copyright 2021 Ronald Lemus
 */

import java.util.Scanner;

public class Comparing_Numbers {
    public static void main(String [] arg){
        System.out.print("Enter the first number: ");
        Scanner firstInp = new Scanner(System.in);
        int firstNum = firstInp.nextInt();

        System.out.print("Enter the second number: ");
        Scanner secondInp = new Scanner(System.in);
        int secondNum = secondInp.nextInt();

        System.out.print("Enter the third number: ");
        Scanner thirdInp = new Scanner(System.in);
        int thirdNum = thirdInp.nextInt();

        if(firstNum > secondNum){
            if(firstNum>thirdNum){
                System.out.printf("The largest number is %d.", firstNum);
            }
            else{
                System.out.printf("The largest number is %d.", thirdNum);
            }
        }
        else if(secondNum > thirdNum){
            System.out.printf("The largest number is %d.", secondNum);
        }
        else{
            System.out.printf("The largest number is %d.", thirdNum);
        }
    }
}
