//Program: Area of parallelogram using Static initialization block.
package com.company;
import java.util.*;

public class Main {
    static int B;
    static int H;
    static boolean flag = true;
    static {                // This block of code will execute first then it will go for p.s.v.m() block, because it is declared with static keyword.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Breadth:");
        B = Sc.nextInt();
        System.out.println("Enter Height:");
        H = Sc.nextInt();
        flag = true;
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print("Area of parallelogram: "+area);
        }
    }
}