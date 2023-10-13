package com.Bank_atm_1;

import java.util.ArrayList;
import java.util.Scanner;

import static com.Bank_atm_1.ATM1.num;

public class Main {
    public static void main(String[] args) {
        int i=1;
        Scanner s1=new Scanner(System.in);
        ArrayList<ATM1> arr=new ArrayList<>();
        ATM1 a1=new ATM1();
        while(i==1){
            System.out.println("Enter 1 for New Account Opening");
            System.out.println("Enter 2 for Deposit");
            System.out.println("Enter 3 for Withdrawl");
            System.out.println("Enter 4 for EXIT");
            int n=s1.nextInt();
            if(n==1){
                ATM1 new_obj=new ATM1();
                a1=new_obj;
                arr.add(a1);
                System.out.println("WELCOME TO PB BANK");
                System.out.println("Enter holder's name");
                a1.name=s1.next();
                System.out.println("Enter security pin");
                a1.pin=s1.nextInt();
                System.out.println("Enter the amount you want to deposit");
                a1.init=s1.nextInt();
                System.out.println("Your account number is:"+num+" Please remeber your account number for future use");
            }
            switch(n){
//                case 1:
//                    ATM1 a1=new ATM1();
//                    arr.add(a1);
//                    System.out.println("WELCOME TO PB BANK");
//                    System.out.println("Enter holder's name");
//                    a1.name=s1.next();
//                    System.out.println("Enter security pin");
//                    a1.pin=s1.nextInt();
//                    System.out.println("Enter the amount you want to deposit");
//                    a1.init=s1.nextInt();
//                    break;
                case 2:
                    System.out.println("Enter your account number");
                    int acc=s1.nextInt();
                    System.out.println("Enter your pin");
                    int pin=s1.nextInt();
                    if(pin== arr.get(acc%1000).pin) {
                        System.out.println("Enter amount you want to deposit");
                        int dep = s1.nextInt();
                        arr.get(acc%1000).init=arr.get(acc%1000).init+dep;
                        System.out.println("BALANCE:"+ arr.get(acc%1000).init);
                    }
                    else{
                        System.out.println("Wrong PIN!!!");
                    }
                    break;
                case 3:
                    System.out.println("Enter your account number");
                    acc=s1.nextInt();
                    System.out.println("Enter your pin");
                     pin=s1.nextInt();
                    if(pin== arr.get(acc%1000).pin) {
                        System.out.println("Enter amount you want to withdraw");
                        int with = s1.nextInt();
                        arr.get(acc%1000).init=arr.get(acc%1000).init-with;
                        System.out.println("BALANCE:"+ arr.get(acc%1000).init);
                    }
                    else{
                        System.out.println("Wrong PIN or ACCOUNT NUMBER!!!");
                    }
                    break;
                case 4:
                    System.out.println("THANK YOU FOR VISITING US....HAPPY BANKING!!!");
                    break;
            }
            if(n==4){
                break;
            }
    }
    }
}
