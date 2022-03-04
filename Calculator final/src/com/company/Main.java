package com.company;
import java.util.*;


public class Main {
    //function for summation
    static int sum(int num1,int num2)	{
        int p= num1+num2;
        return p;
    }
    //function for difference
    static int dif(int num1,int num2)	{
        int q= num1-num2;
        return q;
    }
    //function for multiply
    static int mul(int num1,int num2)	{
        int r= num1*num2;
        return r;
    }
    //function for devide
    static int divi(int num1,int num2)	{
        int s= num1/num2;
        return s;
    }

    public static void main(String[] args) {
        int result=0;

        Scanner input= new Scanner(System.in);
        System.out.print("Hello");
        System.out.print('\n');
        System.out.print('\n');
        System.out.println("press num 1 for sum");
        System.out.println("press num 2 for difference");
        System.out.println("press num 3 for multiply");
        System.out.println("press num 4 for devide");
        System.out.println('\n');
        System.out.print("What do you want to do-");
        int a= input.nextInt();
        System.out.print('\n');
        System.out.print("Enter your first number=");int num1= input.nextInt();
        System.out.print("Enter your Second number=");int num2= input.nextInt();


        switch(a) {
            case 1:
                result=sum(num1,num2);
                break;
            case 2:
                result=dif(num1,num2);
                break;
            case 3:
                result=mul(num1,num2);
                break;
            case 4:
                result=divi(num1,num2);
                break;
            default:
                System.out.println("You have entered a wrong entry");


        }
        System.out.println("The answer is = " + result);

    }
}
