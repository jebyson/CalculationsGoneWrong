package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        System.out.println(x + y + (int)(Math.random()*100));
    }
}
